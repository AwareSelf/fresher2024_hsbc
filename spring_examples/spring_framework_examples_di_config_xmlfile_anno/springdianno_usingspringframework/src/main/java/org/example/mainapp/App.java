package org.example.mainapp;

import org.example.beanintf.ServiceIntf;
import org.example.beans.CourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();

        ServiceIntf service
                = (CourseService)context.getBean(
                "courseService");

        System.out.println(((CourseService)service).getCourse());
    }
}
