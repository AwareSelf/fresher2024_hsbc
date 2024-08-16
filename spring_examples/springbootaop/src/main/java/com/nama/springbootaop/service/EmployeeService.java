package com.nama.springbootaop.service;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nama.springbootaop.beans.Emp;
import com.nama.springbootaop.controller.EmpRestController;

@Service
public class EmployeeService {
	
	
	Logger log = LoggerFactory.getLogger(EmployeeService.class);
	List<Emp> lst;
	
	public EmployeeService()
	{
		this.lst =  new ArrayList<Emp>();
	}
	
	public Emp createEmp(int empId,String empName) {

		log.info("info:inside service:empId=" + empId + ",empName:" + empName);
		log.debug("debug:inside service:empId=" + empId + ",empName:" + empName);

		Optional<Emp> em = lst.stream().filter(e->e.getEmpId()==empId).findFirst();
		if(em.isPresent())
		{
		    throw new RuntimeException("emp with given empId:"+em.get().getEmpId()+" already exists!");
		}
		else {
			Emp emp = new Emp();
			emp.setEmpId(empId);
			emp.setName(empName);
			this.lst.add(emp);

			log.info("info:emp added to list");
			log.debug("debug:emp added to list");
			return emp;
		}
	}

	public void deleteEmp(String empId) {
		
	}

}
