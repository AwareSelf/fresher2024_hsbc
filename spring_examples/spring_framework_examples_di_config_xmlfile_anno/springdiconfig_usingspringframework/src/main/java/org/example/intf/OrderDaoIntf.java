package org.example.intf;

import org.example.model.Order;

import java.util.Optional;

public interface OrderDaoIntf {
    Optional<Order> getOrderById(int id);
    String addOrder(Order o);
}
