package ioex;

public class Empp {
	
	private int empid;
	private String ename;
	private double salary;
	
	public Empp(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
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

	double calcAnnSalary()
	{
		return this.salary*12;
	}

	@Override
	public String toString() {
		return "Empp [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
