package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionTest {
   public static void main(String args[]) {
	   /*
      List<String> list8 = new ArrayList<String>();
      list8.add("INDIA");
      list8.add("AUSTRALIA");
      list8.add("ENGLAND");
      list8.add("NEWZEALAND");
      
      List<String> immutableList8 = Collections.unmodifiableList(list8);
      //immutableList8.add("aaa"); //cannot be modified
      
      
   //   immutableList8.forEach(System.out::println);
      
      System.out.println();
      */
      List<String> immutableList = List.of("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND");
      System.out.println(immutableList);
      
  //    immutableList.add("aaa");
      System.out.println(immutableList);
      
      
      System.out.println();
      
      Set<String> immutableSet = Set.of("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND");
      System.out.println(immutableSet);
     // immutableSet.add("AAA");
      
      
      System.out.println();
      Map<String, String> immutableMap = Map.of("INDIA", "India", "AUSTRALIA", "Australia", "ENGLAND", "England", "NEWZEALAND", "Newzealand");
    //  immutableMap.forEach((key, value) -> System.out.println(key + " : " + value));
      
      System.out.println();
      
   }
}
