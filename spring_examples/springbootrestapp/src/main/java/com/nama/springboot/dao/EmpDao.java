package com.nama.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nama.springboot.exception.EmpNotFoundException;
import com.nama.springboot.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component,@RestController,@Controller,@Service,@Repository
@Service
public class EmpDao {
		


	private List<Employee> lst;
	
	@Autowired  //optional
	public EmpDao()
	{

		lst = new ArrayList<Employee>();
		lst.add(new Employee(1,"Ram",250000,10));
		lst.add(new Employee(2,"Shyam",150000,10));
		lst.add(new Employee(3,"Sita",350000,10));
	}
	
	
	public boolean addEmp(Employee e)
	{
		return lst.add(e);
	}
	
	
	public Employee findEmp(Employee e)
	{
		return lst.stream().filter(emp->emp.getEmpId()==e.getEmpId())
				         .findFirst()
				         .orElseThrow(() -> new EmpNotFoundException("emp with id:"+e.getEmpId()+" not found!"));
		
		
	}
	
	public Employee findEmp(int id)
	{
		return lst.stream().filter(emp->emp.getEmpId()==id)
		         .findFirst()
		         .orElseThrow(() -> new EmpNotFoundException("emp with id:"+id+" not found!"));

	}
	

	
	public Optional<Employee> findEmp2(int id)
	{
		return Optional.ofNullable(lst.stream().filter(emp->emp.getEmpId()==id)
		         .findFirst()
		         .orElse(null));

	}
	
	
	public Employee findEmp(String empName,int deptno)
	{
		return lst.stream().filter(emp->emp.getDeptno()==deptno && emp.getEmpName().equals(empName))
		         .findFirst()
		         .orElseThrow(() -> new EmpNotFoundException("emp with empname:"+empName+"and deptno:"+deptno+" not found!"));

      
	}
	
	
	public boolean updateEmp(int id,Employee e)
	{
		boolean r = lst.remove(e);
		
	
		r = lst.add(e);
		return r;
	}
	public boolean removeEmp(Employee e)
	{
		return lst.remove(e);
	}
	
	public Employee removeEmp(int id)
	{
		return lst.remove(id);
	}
	
	public List<Employee> getAllEmps()
	{
		return this.lst;
	}
}
