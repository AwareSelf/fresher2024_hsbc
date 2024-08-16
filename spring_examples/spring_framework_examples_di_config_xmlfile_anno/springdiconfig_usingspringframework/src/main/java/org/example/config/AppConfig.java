package org.example.config;

import org.example.bl.OrderBL;
import org.example.dao.OrderDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="orderdao")
    public OrderDaoImpl orderDaoImpl() {
        return new OrderDaoImpl();
    }

    @Bean("orderbl")
    public OrderBL orderBL()
    {
           return new OrderBL(orderDaoImpl());
    }



}