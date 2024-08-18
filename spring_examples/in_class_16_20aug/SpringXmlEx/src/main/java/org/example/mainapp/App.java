package org.example.mainapp;

import org.example.impl.HelloBean;
import org.example.impl.Person;
import org.example.intf.HelloIntf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-beans.xml");

       HelloIntf intf = (HelloIntf) context.getBean("hellobean");

        System.out.println(intf.greet("Nisha"));
        System.out.println(intf.greetByName("Hi"));

        if(intf instanceof HelloBean hb)
        System.out.println(hb.getPerson().getName());

    }
}
