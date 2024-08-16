package org.example.beans;

import org.example.beanintf.ServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class CourseService implements ServiceIntf
{
    @Value("Course Service")
    private String serviceName;

    @Autowired
    private Course course;

    public void setCourse(Course course)
    {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}

