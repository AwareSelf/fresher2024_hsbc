package orderexample;

import java.time.LocalDate;

public class Order {

    private int orderId;
    private String orderName;
    private int qty;
    private LocalDate orderDate;

    public Order(int orderId, String orderName, int qty, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.qty = qty;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object obj) {
        return this.orderId == ((Order)obj).orderId;

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", qty=" + qty +
                ", orderDate=" + orderDate +
                '}';
    }
}
