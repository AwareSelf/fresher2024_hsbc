package org.example.bean;

import org.example.intf.ServiceIntf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class CourseService implements ServiceIntf {


    private String serviceName;

    public CourseService() {
    }

    public CourseService(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "CourseService{" +
                "serviceName='" + serviceName + '\'' +
                '}';
    }
}