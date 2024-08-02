package layeredexample.businesslayer;

import layeredexample.businesslayer.busslayerexceptions.OrderSaveException;
import layeredexample.model.Order;
import layeredexample.orderdaoimpl.OrderDaoFactory;
import layeredexample.orderdaoimpl.daoexception.OrderArrayFullException;
import layeredexample.orderdaointf.OrderDaoIntf;

import java.time.LocalDate;

//Order-Business-Layer
public class OrderBL {

    OrderDaoIntf orderintf;

    public OrderBL() {
        this.orderintf = OrderDaoFactory.getOrderDaoImpl("array");
    }

    //factory pattern

      public Order calcTotalOrderPrice(int orderId, String orderName, int qty, double price) throws OrderSaveException
      {
          Order o = new Order(orderId,orderName,qty, LocalDate.now());
          o.setPrice(price);
          double totprice = o.getPrice() * o.getQty();
          o.setTotalPrice(totprice);
           saveOrder(o);
          return o;
      }

      void saveOrder(Order o) throws OrderSaveException
      {
          try {
              this.orderintf.addOrder(o);
          } catch (OrderArrayFullException e) {
              //wrapper exception:OredrSaveException wraps OrderArrayFullException inside it
              throw new OrderSaveException("Order could not be saved/added," +
                      "try adding order after some time..",e);
          }
      }

     public Order[] getAllOrderDetails()
      {
          return this.orderintf.getAllOrders();
      }




}
