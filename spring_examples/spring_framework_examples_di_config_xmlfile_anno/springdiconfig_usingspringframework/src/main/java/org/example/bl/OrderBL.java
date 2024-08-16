package org.example.bl;

import org.example.intf.OrderDaoIntf;
import org.example.model.Order;

public class OrderBL {

    OrderDaoIntf intf;

    public OrderBL(OrderDaoIntf intf) {
        this.intf = intf;
    }

    public String validateAndAddOrder(Order o)
    {
        if(o!=null)
           return this.intf.addOrder(o);
        else
            return "Unable to add Order with orderid:"+o.getOrderId();
    }
}
