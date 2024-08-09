package com.nama.model;

public class Order {
	
	private int orderId;
    private String orderName;
    private int orderPrice;

    public Order()
    {

    }
    public Order(int orderId, String orderName, int orderPrice) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }

}
