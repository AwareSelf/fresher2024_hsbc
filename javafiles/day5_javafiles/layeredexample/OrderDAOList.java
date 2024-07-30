package layeredexample;

//data-access layer
public class OrderDAOList {

    private Order[] orders;
    private int lastIndex;


    public OrderDAOList()
    {
        this.orders = new Order[5];
        this.lastIndex =0;
    }


    public int addOrder(Order o)
    {
      //  this.orders[this.lastIndex] = o;

        //don't assign ref directly otherwise ref and array-ref will share same (memorywise same) Order object
        //instead create a copy and then assign
        Order copy = new Order(o.getOrderId(),o.getOrderName(),o.getQty(),o.getOrderDate());
        this.orders[this.lastIndex]= copy;
        this.lastIndex++;
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
