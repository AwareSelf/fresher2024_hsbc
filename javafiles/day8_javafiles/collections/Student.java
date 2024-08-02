package collections;

import collections.model.Course;

public class Student {
	
	private int stuId;
	private String stName;
	private Course cr;


	public Student(int stuId, String stName, Course cr) {
		super();
		this.stuId = stuId;
		this.stName = stName;
		this.cr = cr;
	}


	/**
	 * @return the stuId
	 */
	public int getStuId() {
		return stuId;
	}


	/**
	 * @param stuId the stuId to set
	 */
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}


	/**
	 * @return the stName
	 */
	public String getStName() {
		return stName;
	}


	/**
	 * @param stName the stName to set
	 */
	public void setStName(String stName) {
		this.stName = stName;
	}


	/**
	 * @return the cr
	 */
	public Course getCr() {
		return cr;
	}


	/**
	 * @param cr the cr to set
	 */
	public void setCr(Course cr) {
		this.cr = cr;
	}
	
	public boolean equals(Object obj) {
		System.out.println();
		if(obj instanceof Student) {
			return stuId == ((Student)obj).stuId;
		}
		else 
		{
			return false;
		}
	}
	
	public int hashCode() {
		return this.getCr().getCourseId();
	}
	
	public Student() {
		
	}


	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stName=" + stName + ", cr=" + cr + "]";
	}
	
	

}
