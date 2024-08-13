package miscellaneous.optionalex;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        /*
        String s  = names[5].toLowerCase();
        System.out.print(s);
      */

        Optional<String> checkNull = Optional.ofNullable(names[5]);

        if (checkNull.isPresent()) {
            String name = names[5].toLowerCase();
            System.out.print(name);
        }
        else
            System.out.println("name is null");



        // Setting value for 2nd index
        names[2] = "Namrata Marathe";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(names[2]);
        System.out.println(value);

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());

        // It returns hashCode of the value
        System.out.println(value.hashCode());

        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());

        /*
        public T orElse(T value)
        Parameters: This method accepts value as a parameter of type T to return if there
        is no value present in this Optional instance.

        Return value: This method returns the value of this Optional instance, if present.
        If there is no value present in this Optional instance, then this method returns the
        specified value.
         */

        // create a Optional
        Optional<Integer> op = Optional.of(999);

        // print value
        System.out.println("Optional: " + op);

        // orElse value
        System.out.println("Value by orElse(100) method: "+ op.orElse(100));

        op = Optional.empty();
        // print value
        System.out.println("Optional: "+ op);

        // orElse value
        System.out.println("Value by orElse(100) method: "+ op.orElse(100));
    }
}
