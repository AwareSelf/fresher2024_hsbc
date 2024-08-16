package org.example.app;

import org.example.bl.OrderBL;
import org.example.model.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.scan("org.example");
       context.refresh();
       OrderBL obj = (OrderBL) context.getBean("orderbl");

        Order o = new Order(3,"Pencil",25);

        System.out.println(obj.validateAndAddOrder(o));
    }
}
