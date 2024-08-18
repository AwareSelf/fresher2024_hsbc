package impl;

import intf.CourseIntf;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class JavaCourse implements CourseIntf {

   private int courseId;


    private String courseName;


    private double coursePrice;

    public JavaCourse() {
        System.out.println("Course Bean zero arg constructor called...");
    }

    public JavaCourse(int courseId, String courseName, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
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
