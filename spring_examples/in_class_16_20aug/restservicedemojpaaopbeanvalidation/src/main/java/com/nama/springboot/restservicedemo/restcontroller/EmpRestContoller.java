package com.nama.springboot.restservicedemo.restcontroller;


import com.nama.springboot.restservicedemo.daorepo.EmpDaoRepo;
import com.nama.springboot.restservicedemo.exception.EmployeeAlreadyExists;
import com.nama.springboot.restservicedemo.exception.EmployeeNotFound;
import com.nama.springboot.restservicedemo.model.Emp;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RequestMapping("emprest")
@RestController  //(@Controller+@ResponseBody)
public class EmpRestContoller {

    Logger logger = LoggerFactory.getLogger(EmpRestContoller.class);

    @Autowired
    private EmpDaoRepo empdao;


    @GetMapping("emp/{empId}")
    public ResponseEntity<Emp> getEmp(@PathVariable int empId) {
        logger.info("inside getEmp method of rest service");
        Optional<Emp> e = this.empdao.findById(empId);
        if (e.isPresent()) {
            logger.info("emp with {} found:{}", empId, e);
            return ResponseEntity.ok(e.get());
        } else { //later on create user defined exception and throw it
            logger.error("exception:emp with given empId:{} is not present", empId);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("emps")
    public List<Emp> getAllEmps() {
       logger.info("inside get all emps of rest service");
        return this.empdao.findAll();
    }


    @PostMapping("emp")
    public ResponseEntity<Emp> saveEmp(@Valid @RequestBody Emp e) throws EmployeeAlreadyExists
    {
        logger.info("inside emprest post:"+e);


            this.empdao.save(e);

            URI location = ServletUriComponentsBuilder
                    .fromCurrentContextPath() //gives base url
                    .path("/emp/{id}") //append path /emp/{id value}
                    .buildAndExpand(e.getEmpId()) //id val come from e.getEmpId()
                    .toUri();
            return ResponseEntity.created(location).build();

    }

    @DeleteMapping("emp")
    public ResponseEntity<String> removeEmp(@RequestBody Emp e)
    {
        logger.info("inside removeEmp method of deletemapping");

            this.empdao.deleteById(e.getEmpId());
            logger.info("emp with empid:"+e.getEmpId()+" deleted successfully");
            return ResponseEntity.ok("Emp removed with empId:"+e.getEmpId());

    }

    @PutMapping("emp")
    public ResponseEntity<String> updateEmp(@RequestBody Emp e)
    {
        logger.info("inside @putmapping / updateEmp method, update emp with empId:{}", e.getEmpId());

        this.empdao.save(e);
        return ResponseEntity.ok("Emp updated with empId:"+e.getEmpId());

      //  return ResponseEntity.notFound().build();


    }

    @DeleteMapping("emp/{empname}")
    public ResponseEntity<String> removeEmpByName(@PathVariable String empname)
    {
        logger.info("inside removeEmpByName method of deletemapping");

        this.empdao.deleteByEmpName(empname);
        logger.info("emp with empname:"+empname+" deleted successfully");
        return ResponseEntity.ok("Emp removed with empname:"+empname);

    }


    @GetMapping("emp/pattern")
    public List<Emp> getAllEmpsWithEmpnameLike() {
        logger.info("inside get all emps whose empname has letter 'm' from rest service");
        return this.empdao.empWithPatternInEmpName();//using JPQL Query
    }

    @GetMapping("emp/pattern1")
    public List<Emp> getAllEmpsWithEmpnameLikeNative() {
        logger.info("inside get all emps whose empname has letter 'm' from rest service");
        logger.info("using jpa native query");
        return this.empdao.empWithPatternInEmpNameUsingNativeQuery();
    }


}

