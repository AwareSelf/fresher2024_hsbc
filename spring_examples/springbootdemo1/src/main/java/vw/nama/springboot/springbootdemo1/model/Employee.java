package vw.nama.springboot.springbootdemo1.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//every class in java extends Object

//@Component
public class Employee implements Comparable<Employee> {
	
   
	//@Value("${employee.id}")
	private int empId;
	

	private String empName;
	

	private double empSalary;


	private int deptno;
	
	protected String proj;
	
	
	
	public Employee()
	{
		System.out.println("0 arg Employee constructor called..");
	}
	
	public Employee(int empId,String empName,double empSalary,int deptno)
	{
		
		System.out.println("arg-wala Employee constructor called..empId:"+empId);
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptno = deptno;
		
	}
	
	//overloaded copy constructor
	public Employee(Employee ob)
	{
		this.empId = ob.empId;
		this.empName = ob.empName;
		this.empSalary = ob.empSalary;
		this.deptno = ob.deptno;
	}
	
	
	//setter and getter methods for all private properties
	
	
	//2000 loc
    public double computeAnnualSalary()
	{
		
		return this.empSalary*12; //jump back to 1001
	}
	
	//function overloading
	//compile-time polymorphism //static polymorphism
	//early binding
	public double computeAnnualSalary(long bonus)
	{
		
		System.out.println("inside computeAnnualSalary(long)");
		return this.empSalary*12 + bonus;
	}
	
	public double computeAnnualSalary(int incentive)
	{
		
		System.out.println("inside computeAnnualSalary(int");
		
		return this.empSalary*12 + incentive;
	}
	
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		
		if(empSalary>0)
		{
		  this.empSalary = empSalary;
		}
		else
		{
			System.out.println("you are trying to set salary value as:"+empSalary+",but Salary can't be -ve");
		}
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getEmpId() {
		return empId;
	}

	
	  @Override 
	  public int hashCode()
	  {
		  //System.out.println("Employee's hashCode method called...");   
		  return this.deptno;
	  }
	
		/*
		 * @Override public boolean equals(Object obj) //Object obj = e { //
		 * System.out.println("Employee's equals method called..."); return
		 * this.empId==((Employee)obj).empId; }
		 */
	  
	  //-ve means not swap and +ve value means swap 
	  @Override
		public int compareTo(Employee o) {
				 
		return this.empId - o.empId;
		  
		    //descending
		  //  return o.empId - this.empId;
		}
		 
	 
	
	  @Override 
	  public String toString() {
	  
	//  System.out.println("toString of Employee called..."); 
	  
	  return
	  "emp details:empid:"+this.empId +", empname:"+this.empName
	  +", empsalary:"+this.empSalary +", empdeptno:"+this.deptno; }

	
	
	

}
