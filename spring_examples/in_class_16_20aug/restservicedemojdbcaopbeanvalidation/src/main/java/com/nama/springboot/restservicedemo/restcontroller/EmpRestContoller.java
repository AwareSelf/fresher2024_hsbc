package com.nama.springboot.restservicedemo.restcontroller;


import com.nama.springboot.restservicedemo.daorepo.EmpDaoIntf;
import com.nama.springboot.restservicedemo.exception.EmployeeAlreadyExists;
import com.nama.springboot.restservicedemo.exception.EmployeeNotFound;
import com.nama.springboot.restservicedemo.model.Emp;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RequestMapping("emprest")
@RestController  //(@Controller+@ResponseBody)
public class EmpRestContoller {

    Logger logger = LoggerFactory.getLogger(EmpRestContoller.class);

    @Autowired
    private EmpDaoIntf empdao;


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

        try {
            this.empdao.save(e);

            URI location = ServletUriComponentsBuilder
                    .fromCurrentContextPath() //gives base url
                    .path("/emp/{id}") //append path /emp/{id value}
                    .buildAndExpand(e.getEmpId()) //id val come from e.getEmpId()
                    .toUri();
            return ResponseEntity.created(location).build();
        }
        catch(EmployeeAlreadyExists ex)
        {
            logger.error("EmpRestController:exception while saving emp with empId:"+e.getEmpId());
            logger.error("EmpRestController:"+ex.getMessage());
            throw ex;
        }
    }

    @DeleteMapping("emp")
    public ResponseEntity<String> removeEmp(@RequestBody Emp e)
    {
        logger.info("inside removeEmp method of deletemapping");
        try
        {
            int no =this.empdao.deleteById(e.getEmpId());
            logger.info("emp with empid:"+e.getEmpId()+" deleted successfully");
            return ResponseEntity.ok("Emp removed with empId:"+e.getEmpId());
        }
        catch(EmployeeNotFound ex)
        {
            //ResponseStatusException is used from Spring 5 and above
           // return ResponseEntity.notFound().build();
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,ex.getMessage(),ex);
        }

    }

    @PutMapping("emp")
    public ResponseEntity<String> updateEmp(@RequestBody Emp e)
    {
        logger.info("inside @putmapping / updateEmp method, update emp with empId:{}", e.getEmpId());
       int no =this.empdao.update(e);

        if(no>=1)
        {
            return ResponseEntity.ok("Emp updated with empId:"+e.getEmpId());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }

    }
}

