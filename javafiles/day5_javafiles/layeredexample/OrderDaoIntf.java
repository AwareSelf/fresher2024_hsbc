package layeredexample;

public interface OrderDaoIntf {


    public int addOrder(Order o);
    public Order[] getAllOrders();
     public int updateOrder(Order o);
  //  public int updateOrder(int orderId,int qty);
}
