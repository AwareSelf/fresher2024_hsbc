package jdbc.orderservice;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        OrderDaoIntf intf=null;
        try {
             intf = new OrderDaoImpl();

        } catch (SQLException e) {
            System.out.println("Db connection not successful!");
        }
            Order o1 = new Order(1,"Pen",100);
            Order o2 = new Order(2,"Book",50);

        try {
            intf.addOrder(o1);
            intf.addOrder(o2);
        } catch (SQLException e) {
            System.out.println("exception during add order:"+e);
            e.printStackTrace();
        }

        try {
          List<Order> orders = intf.getAllOrders();
          orders.forEach(o-> System.out.println(o));

        } catch (SQLException e) {
            System.out.println("exception during get all orders:"+e);
            e.printStackTrace();
        }

        try {
            Order order = intf.getOrder(1);
            System.out.println(order);

        } catch (SQLException e) {
            System.out.println("exception during get order by id:"+e);
            e.printStackTrace();
        }




    }
}
