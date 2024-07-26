package java8;
import java.util.*;
import java.util.function.Consumer;

public class LambdaList{
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
  
    
   // Consumer<Integer> method = (n) -> { System.out.println(n); }; //1
    
   // numbers.forEach( method ); //2
    
    //-------------or--------------------------
    
    //1 & 2 combine
    numbers.forEach( (n) -> System.out.println(n) );
  }
}


