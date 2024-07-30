package layeredexample;

import java.time.LocalDate;

public class MainApp {

    public static void main(String[] args) {


        Order o1 = new Order(1,"Pen",5, LocalDate.now());
        Order o2 = new Order(2,"Mobile",4,LocalDate.now());


        OrderService oser = new OrderService();
        oser.addOrder(o1);
        oser.addOrder(o2);

        Order[] arr = oser.getAllOrders();

        for(Order o:arr)
        {
            System.out.println(o);
        }
        o1.setQty(10);
        oser.updateOrder(o1);
        arr = oser.getAllOrders();

        for(Order o:arr)
        {
            System.out.println(o);
        }




    }

}
