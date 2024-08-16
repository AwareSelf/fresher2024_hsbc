package org.example;

import org.example.intf.ServiceIntf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");


        ServiceIntf obj = (ServiceIntf) context.getBean("courseService");
        System.out.println(obj.getServiceName());
    }
}
