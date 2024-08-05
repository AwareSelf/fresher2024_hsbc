package layeredexample.orderdaointf;

import layeredexample.model.Order;
import layeredexample.orderdaoimpl.daoexception.OrderArrayFullException;

public interface OrderDaoIntf {


    public int addOrder(Order o) throws OrderArrayFullException;
    public Order[] getAllOrders();
     public int updateOrder(Order o);
  //  public int updateOrder(int orderId,int qty);
}
