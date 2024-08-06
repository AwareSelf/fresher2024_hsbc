package jdbc.orderservice;

import java.sql.SQLException;
import java.util.List;

public interface OrderDaoIntf {

    public void addOrder(Order o) throws SQLException;
    public Order getOrder(int orderId) throws SQLException;
    public List<Order> getAllOrders() throws SQLException;

}
