package com.nama.springboot.restservicedemo.restcontroller;


import com.nama.springboot.restservicedemo.dao.EmpDaoIntf;
import com.nama.springboot.restservicedemo.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RequestMapping("emprest")
@RestController  //(@Controller+@ResponseBody)
public class EmpRestContoller {

    @Autowired
    private EmpDaoIntf empdao;

    @GetMapping("restname")
  //  @RequestMapping(value="restname", method=RequestMethod.GET)
    public String getRestServiceName()
    {
        return "EmpRestController Service";
    }

    //http://localhost:8084/emp/1 - get req
    @GetMapping("emp/{empId}")
    public Emp getEmp(@PathVariable int empId) {
        System.out.println("inside getEmp method of rest service");
        Optional<Emp> e = this.empdao.getEmp(empId);
        if (e.isPresent()) {
            return e.get();
        } else { //later on create user defined exception and throw it
            System.out.println("exception:emp with given empId:" + empId + " is not present");
            return null;
        }
    }

    @GetMapping("emp1/{empId}")
    public ResponseEntity<Emp> getEmp2(@PathVariable int empId) {
        System.out.println("inside getEmp method of rest service");
        Optional<Emp> e = this.empdao.getEmp(empId);
        if (e.isPresent()) {
            return ResponseEntity.ok(e.get());
        } else { //later on create user defined exception and throw it
            System.out.println("exception:emp with given empId:" + empId + " is not present");
            //return null;
                          //ResponseEntity.status(HttpStatus.BAD_REQUEST)
             return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("empp")
    public ResponseEntity<Emp> getEmp1(@RequestParam int empId) {
        System.out.println("inside getEmp method of rest service");
        Optional<Emp> e = this.empdao.getEmp(empId);
        if (e.isPresent()) {
            return ResponseEntity.ok(e.get());
        } else { //later on create user defined exception and throw it
            System.out.println("exception:emp with given empId:" + empId + " is not present");
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("emps")
    public List<Emp> getAllEmps() {
        System.out.println("inside get all emps of rest service");
        return this.empdao.getAllEmps();
    }


    @PostMapping("emp")
    public ResponseEntity<Emp> saveEmp(@RequestBody Emp e)
    {
        System.out.println(e);

        this.empdao.saveEmp(e);


        System.out.println( ServletUriComponentsBuilder
                .fromCurrentRequest().toUriString());

        System.out.println(ServletUriComponentsBuilder.fromCurrentContextPath().toUriString());


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
        boolean status =this.empdao.removeEmp(e);

        if(status)
        {
            return ResponseEntity.ok("Emp removed with empId:"+e.getEmpId());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("emp")
    public ResponseEntity<String> updateEmp(@RequestBody Emp e)
    {
        boolean status =this.empdao.updateEmp(e);

        if(status)
        {
            return ResponseEntity.ok("Emp updated with empId:"+e.getEmpId());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }

    }
}

