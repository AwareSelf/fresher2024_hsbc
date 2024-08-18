package impl;

import intf.CourseIntf;
import intf.ServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class CourseService implements ServiceIntf {


    private String serviceName;

     private CourseIntf course;


    public CourseService() {
        System.out.println("CourseService empty constructor called..");
    }


    public CourseService(String serviceName, CourseIntf course) {
        this.serviceName = serviceName;
        this.course = course;
    }

    public CourseService(String serviceName) {
        System.out.println("Arg-wala CourseService constructor called..");
        this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public CourseIntf getCourse() {
        return course;
    }

    public void setCourse(CourseIntf course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CourseService{" +
                "serviceName='" + serviceName + '\'' +
                ", course=" + course +
                '}';
    }
}
