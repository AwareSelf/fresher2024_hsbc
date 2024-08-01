package layeredexample.viewlayer;

import layeredexample.businesslayer.busslayerexceptions.OrderSaveException;
import layeredexample.model.Order;
import layeredexample.businesslayer.OrderBL;

import java.util.Scanner;

//OrderUI layer
public class OrderView {

    OrderBL bl;

    public OrderView()
    {
        this.bl = new OrderBL();
    }

   public void  inputOrderDetials()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order details:");
        System.out.println("Orderid:");
        int orderid = sc.nextInt();
        System.out.println("Order/Item Name:");
        String itemname = sc.next();
        System.out.println("quantity of items:");
        int qty = sc.nextInt();

        System.out.println("Enter price of 1 item:");
        double price = sc.nextDouble();
        Order o = null;
        try {
            o = this.bl.calcTotalOrderPrice(orderid,itemname,qty,price);
        } catch (OrderSaveException e) {
            System.out.println(e.getMessage());
            System.out.println("underlying root cause for debugging purpose:"+e.getCause());
            System.out.println(e);
        }
        System.out.println("Order details after computing total order:"+o);

    }

    public void showAllOrders()
    {
        System.out.println("Listing all existing orders...:");
        Order[] arr = this.bl.getAllOrderDetails();
        for(Order o:arr)
        {
            if(o!=null) {
                System.out.println(o);
            }
        }
    }

    public void showSingleOrder(int orderId)
    {

    }



}
