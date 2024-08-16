package vw.nama.web.MVCdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vw.nama.web.MVCdemo.exception.EmployeeNotFoundException;
import vw.nama.web.MVCdemo.model.Employee;


@Service  //empDao
public class EmpDao {
	
	List<Employee> lst;
	Logger logger = LoggerFactory.getLogger(EmpDao.class);

	public EmpDao()
	{
		this.lst = new ArrayList<>();
	}
	

	
	public Employee saveEmp(Employee e)
	{
	   this.lst.add(e);
	    
	    logger.debug("fetched employee:{}",e);
	    return e;
	}
	
	public Employee fetchEmp(int empid)
	{
		Optional<Employee> opemp =
				this.lst.stream().filter(e->e.getEmpId()==empid).findFirst();
		
		if(opemp.isPresent())
		{
			return opemp.get();
		}
		else
		{
			throw new EmployeeNotFoundException("employee with empid:"+empid+" not found!");
		}
	}
	
	
	public List<Employee> getAllEmps()
	{
		return this.lst;
	}

}
