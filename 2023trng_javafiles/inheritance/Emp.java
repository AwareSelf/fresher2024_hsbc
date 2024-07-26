package inheritance;

public class Emp {
	
	private int empId;
	private String empName;
	private double empSal;
	private static int count;
	
	
	
	
	  public Emp() { 
		  count++;
		  System.out.println("Emp 0 arg constructor called"); 
		  }
	  
	  
	  public Emp(int empId,String empName,double empSal)
	  {
		  System.out.println("Emp overloaded argwala constructor called..");
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


	public double calcAnnSal()
	  {
		
		return this.empSal * 12;  
	  }
	
	//only certain privileged emps get this
	 public double calcAnnSal(double bonus)
	  {
		
		return this.empSal * 12 +bonus;  
	  }
	  
	//String representation of your object
	 
	 @Override
	public String toString()
	{
		return this.empId+","+this.empName+","+this.empSal;
	}
	
	

}
