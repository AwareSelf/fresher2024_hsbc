package collections.model;

import java.util.Objects;

public class Emp implements Comparable<Emp> 
{
	
	private int empId;
	private String empName;
	private double empSal;
	private Dept dept;
	private static int count;
	
	
	
	
	  public Emp() { 
		 // this(1,"Ram",5000);
		  count++;
		  System.out.println("Emp 0 arg constructor called");
		 
		  }
	  
	  
	  public Emp(int empId,String empName,double empSal)
	  {
		  count++;
		  this.empId =empId;
		  this.empName = empName;
		  this.empSal =empSal;
	  }
	 
	  //copy constructor
	 Emp(Emp o)
	 {
		 this.empId = o.empId;
		 this.empName = o.empName;
		 this.empSal =  o.empSal;
	 }
	 
	 
	
	  public Emp(int empId, String empName, double empSal, Dept dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	public int getEmpId() {
		return empId;
	}

	//static method cannot access non-static instance/object property
	// as instance might not have been created till that time
	public static int incrCount()
	{
	//	System.out.println(empId);
		count+=1;
		return count;
	}

	public static int getCount() {
		return count;
	}
	


	public static void setCount(int count) {
		if(count>=0)
		{
		  Emp.count = count;
		}
	}

	

	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	public double calcAnnSal()
	  {
		
		return this.empSal * 12;  
	  }
	
	//only certain privileged emps get this
	 public double calcAnnSal(double bonus)
	  {
		
		return this.empSal * 12 +bonus;  
	  }
	 
	 
	  
	@Override
	public int hashCode() {
		return this.getDept().getDeptno();
	}


	@Override
	public boolean equals(Object obj) {
	
		if (obj == null)
			return false;
		
		Emp other = (Emp) obj;
		return  empId == other.empId ;
	}


	//String representation of your object
	public String toString()
	{
		return this.empId+","+this.empName+","+this.empSal 
				+","+this.getDept();
	}

	
	  @Override public int compareTo(Emp o) {
	  
	  System.out.println("Emp compareTo of comparable called"); return this.empId -
	  o.empId; // return o.empId - this.empId; 
	  }
	 

	
	

}
