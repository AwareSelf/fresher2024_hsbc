package collections.model;

public class Course {
	
	private int courseId;
	String courseName;
	public Course(int courseId, String courseName) {
		super();
		this.setCourseId(courseId);
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + getCourseId() + ", courseName=" + courseName + "]";
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

}
