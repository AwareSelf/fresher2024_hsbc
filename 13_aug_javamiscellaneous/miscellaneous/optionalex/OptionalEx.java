package miscellaneous.optionalex;

import layeredexample.model.Order;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;
//https://www.geeksforgeeks.org/java-8-optional-class/?ref=lbp

/*
Every Java Programmer is familiar with NullPointerException.
It can crash your code. And it is very hard to avoid it without using too many null checks.
So, to overcome this, Java 8 has introduced a new class Optional in java.util package.
It can help in writing a neat code without using too many null checks. By using Optional,
we can specify alternate values to return or alternate code to run.
This makes the code more readable because the facts which were hidden are now visible to the
developer.
 */
public class OptionalEx {
    public static void main(String[] args) {

        Dao dao = new OrderDao();
        Optional<Order> o = dao.get(1);
        if(o.isPresent())
        {
            System.out.println(o.get().getOrderId());
        }
        else
        {
            System.out.println("Order with given id not found!");
        }

        Order x = new Order(1,"Pen",100, LocalDate.now());
        Order o1 = o.orElse(x);
        System.out.println(o1);
    }

}
