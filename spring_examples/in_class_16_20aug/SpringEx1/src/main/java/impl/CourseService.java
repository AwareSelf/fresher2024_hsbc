package impl;

import intf.CourseIntf;
import intf.ServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//CourseService has-a Course
//@Component
@Component("courseser")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CourseService implements ServiceIntf {

    @Value("Course Service")
    private String serviceName;

    @Qualifier("javacourse")

    private CourseIntf course;


    public CourseService() {
        System.out.println("CourseService empty constructor called..");
    }

    public CourseService(String serviceName) {
        System.out.println("Arg-wala CourseService constructor called..");
        this.serviceName = serviceName;
    }


    public CourseService(String serviceName,   @Autowired CourseIntf course) {
        this.serviceName = serviceName;
        this.course = course;
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
