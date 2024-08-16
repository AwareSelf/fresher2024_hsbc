package com.nama.springbootaop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nama.springbootaop.beans.Emp;
import com.nama.springbootaop.service.EmployeeService;

import java.net.http.HttpResponse;

@RestController
public class EmpRestController {
	
	Logger log = LoggerFactory.getLogger(EmpRestController.class);
	
	@Autowired
	Emp e;
	
	@Autowired
	EmployeeService empser;
	
	@GetMapping("/emp")
	public Emp getEmp()
	{
		return this.e;
	}

	@GetMapping("/emp/empname")
	public String getEmpName()
	{
		return this.e.getName();
	}
	
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public Emp addEmployee(@RequestParam("empname") String empName, 
			@RequestParam("empid") int empId) {

		log.info("inside emprest controller:info level:empname:"+empName+",empid:"+empId);
		log.debug("emprestcontroller:debug level:empname:"+empName+",empid:"+empId);
		try {
			Emp e = empser.createEmp(empId, empName);
			return e;
		}
		catch(RuntimeException e)
		{
			log.error("inside emprest controller:exception is thrown while creating emp");
			//e.printStackTrace();
			log.error(e.getMessage());
			return null;
		}

	}

	@GetMapping("/remove/employee/{empid}")
	public String removeEmployee(@PathVariable int empid)
    {

	//	empser.deleteEmployee(empid);

		return "Employee removed";
	}
}
