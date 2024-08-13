package miscellaneous.optionalex;

import java.util.Optional;

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        // create a Optional
        Optional<Integer> op
                = Optional.ofNullable(null);

        /*
        Question1> what will be output for
         Optional<Integer> op
                = Optional.ofNullable(100);
        Question2> What will happen if instead of ofNullable() you use Optional.of() method

        Optional<Integer> op
                = Optional.of(null);
         */

        // print supplier
        System.out.println("Optional: "
                + op);

        // orElseThrow supplier
         op.orElseThrow(ArithmeticException::new);
    }
}
