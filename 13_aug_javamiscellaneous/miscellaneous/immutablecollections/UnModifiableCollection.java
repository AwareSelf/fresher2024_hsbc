package miscellaneous.immutablecollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifiableCollection {
    public static void main(String[] args) {

        /*
       c1 is mutable (i.e. neither unmodifiable nor immutable).
       c2 is unmodifiable: it can't be changed itself, but if later on I change c1 then
       that change will be visible in c2.
       This is because c2 is simply a wrapper around c1 and not really an independent copy.
         */
        List<String> c1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> c2 = Collections.unmodifiableList(c1);
        //   c2.add("four");
        c1.add("four");
        System.out.println(c1);
        System.out.println(c2);
    }
}
