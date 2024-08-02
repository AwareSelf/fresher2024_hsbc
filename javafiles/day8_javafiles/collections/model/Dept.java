package collections.model;

public class Dept {
	
	private int deptno;
	private String deptName;
	
	
	public Dept(int deptno, String deptName) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptName=" + deptName + "]";
	}
	
	
	
	

}
