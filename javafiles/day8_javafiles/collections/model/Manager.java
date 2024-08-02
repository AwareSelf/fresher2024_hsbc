package collections.model;

public class Manager extends Emp {
	
	private String mgrType;
	private int teamSize;
	
	public Manager(int empId, String empName, double empSal, Dept dept, String mgrType, int teamSize) {
		super(empId, empName, empSal, dept);
		this.mgrType = mgrType;
		this.teamSize = teamSize;
	}

	public String getMgrType() {
		return mgrType;
	}

	public void setMgrType(String mgrType) {
		this.mgrType = mgrType;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [mgrType=" + mgrType + ", teamSize=" + teamSize + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
