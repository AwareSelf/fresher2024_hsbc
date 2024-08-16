package org.example.dao;

import org.example.intf.OrderDaoIntf;
import org.example.model.Order;


import java.util.*;

public class OrderDaoImpl implements OrderDaoIntf {

    List<Order> lst;

    public  OrderDaoImpl()
    {
       this.lst =  new ArrayList<>();
       Order o1 = new Order(1,"Pen",100);
       Order o2 = new Order(2,"Book",200);
       this.lst.add(o1);
       this.lst.add(o2);
    }

    @Override
    public Optional<Order> getOrderById(int id) {

       return this.lst.stream().filter(o->o.getOrderId()==id).findFirst();
    }

    @Override
    public String addOrder(Order o) {
        this.lst.add(o);
        return "Order with orderid:"+o.getOrderId()+" added successfully";
    }
}