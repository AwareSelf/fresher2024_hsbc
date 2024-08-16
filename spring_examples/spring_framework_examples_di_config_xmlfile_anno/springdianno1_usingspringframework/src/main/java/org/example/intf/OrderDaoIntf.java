package org.example.intf;

import org.example.model.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface OrderDaoIntf {
    Optional<Order> getOrderById(int id);
    String addOrder(Order o);
}
