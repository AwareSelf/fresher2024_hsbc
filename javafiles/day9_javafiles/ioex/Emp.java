package ioex;

import java.io.Serializable;

public class Emp implements Serializable {
	
	private int empid;
	private String ename;
	private double salary;
	private Department dept;
	transient private MyDate joinDate;

	
	public Emp()
	{
		System.out.println("Employee no-arg constructor called..");
	}
	
	
	
	
	public Emp(int empid, String ename, double salary, Department dept,MyDate joinDate) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	//	this.joinDate = joinDate;  -- this is wrong
		this.joinDate =  new MyDate(joinDate.getDate(),
				                    joinDate.getMonth(),
				                    joinDate.getYear());
	}







	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getEmpid() {
		return empid;
	}
	
	
	
		
	public Department getDept() {
		return dept;
	}




	public void setDept(Department dept) {
		this.dept = dept;
	}



	
	

	public MyDate getJoinDate() {
		return joinDate;
	}




	public void setJoinDate(MyDate joinDate) {
		this.joinDate = joinDate;
	}




	public double calcAnnSal()
	{
		System.out.println("priniting annual salary of employee "+this.ename);
		return this.salary*12;
	}




	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + ", joinDate="
				+ joinDate + "]";
	}

	
	



	
	
	

}
