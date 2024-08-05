package collectionsex;

import java.util.ArrayList;
import java.util.List;

//Wrapper class is used to convert/assign primitive type to its corresponding Object type
// like int --> Integer
//Wrapper class also has conversion methods to convert wrapped primitive into other datatypes
// for e.g.: int-->double, int-->String, String-->int
public class WrapperIntegerEx {
    public static void main(String[] args) {
        int no = 4;

        Integer ob = no; //Integer ob = new Integer(no); //auto-boxing

        String n = ob.toString();
        System.out.println(n+10);

        //int --> double // int-->Integer object-->doubleValue()--> primitive double
        double d = ob.doubleValue();
        System.out.println(d);

        //double --> int //double-->Double-->intValue()-->primitive int
        Double x = d;
        int no1 = x.intValue();

        Integer o = 9;

        //primitive int = Integer object
            int nx = o;   // int nx = o.intValue(); // auto-unboxing

         int val = Integer.parseInt("100");
        System.out.println(val+1);

      //All collection classes accept only Object types and not primitive type
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(34);
        lst.add(34); // 34 primitive int is auto-boex into Integer object and added to ArrayList
        lst.add(3);
        lst.add(8);
        lst.add(1);
        System.out.println(lst);

        int val1 = lst.get(0); //auto-unboxing it. Integer --> int automatically
        System.out.println(val1);


    }
}
