package com.nama.springboot.controller;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nama.springboot.dao.EmpDao;
import com.nama.springboot.exception.ResourceNotFoundException;
import com.nama.springboot.model.Employee;

import java.util.List;
import java.util.Optional;


@RestController  //@Controller + @ResponseBody
@RequestMapping("/employees")
public class EmpRestController {
	
	//dependency of GreeRestService
	//DI- Dependency Injection - basic feature of Spring container
	
    @Autowired
	EmpDao empdao;
    
 
	
	 private static Logger LOGGER = LoggerFactory.getLogger(EmpRestController.class);
	
	@GetMapping("hello")
	public String sayHello()
	{
		//System.out.println("sayHello() called");
		LOGGER.debug("sayHello() called");
		return "<h3>Hello Everyone!</h3>";
	}
	
	@GetMapping("hello1/{name}")
	public String sayHello(@PathVariable String name)
	{
		//System.out.println("sayHello() called");
		LOGGER.debug("sayHello() called");
		return "<h3>Hello "+ name+" </h3>";
	}
	
		
	@GetMapping("hello1")
	public String sayHello1(@RequestParam(name="name") String name)
	{
		//System.out.println("sayHello() called");
		LOGGER.debug("sayHello() called");
		return "<h3>Hello "+ name+" </h3>";
	}
	
	@GetMapping("emp/{empId}")
	public Employee getEmpUsingPathVariable1(@PathVariable int empId)
	{
		LOGGER.debug("getEmpUsingPathVariable() called:empId:"+empId);
		return empdao.findEmp(empId);
		
	}
	
	@GetMapping("emp1/{empId}")
	public ResponseEntity<Employee> getEmpUsingPathVariable(@PathVariable int empId)
	{
		LOGGER.debug("getEmpUsingPathVariable() called:empId:"+empId);
		Optional<Employee> x = empdao.findEmp2(empId);
		LOGGER.debug("emp found:"+x);
		if(x.isEmpty())
			throw new ResourceNotFoundException("emp with empId:"+empId+" not found");
		else
		  return ResponseEntity.ok(x.get());
	}
	
	
	
	@GetMapping("emp/{empname}/{deptno}")
	public Employee getEmpUsingPathVariable(@PathVariable String empname,@PathVariable int deptno)
	{
		LOGGER.debug("getEmpUsingPathVariable() called:empname:"+empname+",deptno:"+deptno);
		return empdao.findEmp(empname,deptno);
		
	
	}
	
	@GetMapping("emp")
	public Employee getEmpUsingReqParam(@RequestParam(name="empId") int empId)
	{
		LOGGER.debug("getEmpUsingRequestParam() called:empId:"+empId);
		return empdao.findEmp(empId);
		
	}
	
	@GetMapping("empbyname")
	public Employee getEmpUsingReqParam(@RequestParam(name="empname") String empname,
			                            @RequestParam(name="deptno") int deptno)
	{
		LOGGER.debug("getEmpUsingRequestParam() called:empname:"+empname+",deptno:"+deptno);
		return  empdao.findEmp(empname,deptno);
		

	}
	
	@GetMapping("emps")
	public List<Employee> getAllEmps()
	{
		LOGGER.debug("getAllEmps()");
	
		return empdao.getAllEmps();
		
	
	}
	
	@PostMapping("emp")
	public boolean postEmp(@Valid @RequestBody Employee e)
	{
		return this.empdao.addEmp(e);
	}
	
		
	

}
