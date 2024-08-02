package ioex;

import java.io.Serializable;

public class Department implements Serializable {
	
	
	private int deptid;
	private String deptname;
	private int teamSize;
	
	
	public Department(int deptid, String deptname, int teamSize) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.teamSize = teamSize;
	}

	//copy constructor - create a copy of department object referenced by x
	public Department(Department x)
	{
		this.deptid = x.deptid;
		this.deptname = x.deptname;
		this.teamSize = x.teamSize;
	}

	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public int getDeptid() {
		return deptid;
	}

	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("Department's equals method called..");
		return this.deptid == ((Department)o).deptid;
	}
	
	
	

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", teamSize=" + teamSize + "]";
	}
	
	
	
	
	

}
