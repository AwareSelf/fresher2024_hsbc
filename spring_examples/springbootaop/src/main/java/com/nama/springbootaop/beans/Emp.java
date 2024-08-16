package com.nama.springbootaop.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Emp {
	
	
	@Value("${empname}")
	String name;
	
	@Value("${empid}")
	int empId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", empId=" + empId + "]";
	}
	
	
	
}
