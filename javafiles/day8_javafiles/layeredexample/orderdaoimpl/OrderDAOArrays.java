package layeredexample.orderdaoimpl;

import layeredexample.model.Order;
import layeredexample.orderdaoimpl.daoexception.OrderArrayFullException;
import layeredexample.orderdaointf.OrderDaoIntf;

//data-access layer
public class OrderDAOArrays implements OrderDaoIntf {

    private Order[] orders;
    private int lastIndex;


    public OrderDAOArrays()
    {
        this.orders = new Order[1];
        this.lastIndex =0;
    }


    public int addOrder(Order o) throws OrderArrayFullException
    {
      //  this.orders[this.lastIndex] = o;

        //don't assign ref directly otherwise ref and array-ref will share same (memorywise same) Order object
        //instead create a copy and then assign
        Order copy = new Order(o.getOrderId(),o.getOrderName(),
                       o.getQty(),o.getOrderDate(),o.getPrice(),o.getTotalPrice());

        if(this.lastIndex <  this.orders.length) {
            this.orders[this.lastIndex] = copy;
            this.lastIndex++;
        }
        else
        {
            System.out.println("array size if full,cant add new order");
            throw new OrderArrayFullException(this.orders.length);

        }
        return o.getOrderId();
    }

    public Order[] getAllOrders()
    {
        return this.orders;
    }

    public int updateOrder(Order o)
    {
        for(int i=0;i<this.orders.length;i++)
        {
            if(o.equals(this.orders[i]))
            {
                this.orders[i].setQty(o.getQty());
                return this.orders[i].getOrderId();
            }
        }
        return -1;
    }
}
