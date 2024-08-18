package impl;

import intf.CourseIntf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SpringBootCourse implements CourseIntf {

    @Value("102")
    private int courseId;

    @Value("SpringBoot")
    private String courseName;

    @Value("25000")
    private double coursePrice;

    public SpringBootCourse() {
        System.out.println("Course Bean zero arg constructor called...");
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public double getCoursePrice() {
        return this.coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                '}';
    }
}
