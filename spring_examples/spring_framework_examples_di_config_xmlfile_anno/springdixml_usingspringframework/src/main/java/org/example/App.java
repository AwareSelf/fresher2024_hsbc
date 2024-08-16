package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CourseService courseService
                = (CourseService)context.getBean(
                "courseService");

        System.out.println(courseService.getCourse());
    }
}
