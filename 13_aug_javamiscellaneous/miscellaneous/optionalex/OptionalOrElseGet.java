package miscellaneous.optionalex;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseGet {
    public static void main(String[] args) {

        // create a Optional
        Optional<Integer> op
                = Optional.of(9455);

        // print supplier
        System.out.println("Optional: "+ op);

       //Supplier is Functional interface has single abstract method get() which return
        // a value of specific type
        Supplier s =  () -> (int)(Math.random() * 10);
        int no = op.orElseGet(s);
        System.out.println(no);




    }
}
