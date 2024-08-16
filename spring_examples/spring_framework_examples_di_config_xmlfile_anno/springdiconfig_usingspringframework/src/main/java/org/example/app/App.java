package org.example.app;

import org.example.bl.OrderBL;
import org.example.config.AppConfig;
import org.example.intf.OrderDaoIntf;
import org.example.model.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       OrderBL obj = (OrderBL) context.getBean("orderbl");

        Order o = new Order(3,"Pencil",25);

        System.out.println(obj.validateAndAddOrder(o));
    }
}
