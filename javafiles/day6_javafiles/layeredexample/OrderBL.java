package layeredexample;

import java.time.LocalDate;

//Order-Business-Layer
public class OrderBL {

    OrderDaoIntf orderintf;


    //factory pattern
   OrderDaoIntf getOrderDaoImpl(String impltype)
      {
           if(impltype.equalsIgnoreCase("array"))
           {
              this.orderintf = new OrderDAOArrays();
           }
           else if(impltype.equalsIgnoreCase("list"))
           {
               this.orderintf = new OrderDAOList();
           }

           return this.orderintf;
      }


      Order calcTotalOrderPrice(int orderId,String orderName,int qty,double price)
      {
          Order o = new Order(orderId,orderName,qty, LocalDate.now());
          o.setPrice(price);
          double totprice = o.getPrice() * o.getQty();
          o.setTotalPrice(totprice);
          saveOrder(o);
          return o;
      }

      void saveOrder(Order o)
      {
            this.orderintf = this.getOrderDaoImpl("array");
            this.orderintf.addOrder(o);
      }

      Order[] getAllOrderDetails()
      {
          return this.orderintf.getAllOrders();
      }




}
