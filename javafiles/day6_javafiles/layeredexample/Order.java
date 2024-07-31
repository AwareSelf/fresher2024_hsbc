package layeredexample;

import java.time.LocalDate;

public class Order {

    private int orderId;
    private String orderName;
    private int qty;
    private LocalDate orderDate;

    private double price;
    private double totalPrice;

    public Order(int orderId, String orderName, int qty, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.qty = qty;
        this.orderDate = orderDate;
    }

    public Order(int orderId, String orderName, int qty, LocalDate orderDate, double price, double totalPrice) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.qty = qty;
        this.orderDate = orderDate;
        this.price = price;
        this.totalPrice = totalPrice;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';

     }
}
