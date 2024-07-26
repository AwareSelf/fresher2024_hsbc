package java8;
import java.util.*;

public class ComparatorLambda {

	public static void main(String[] args) {
		
	  Comparator<Integer> c = (n1,n2)->n2-n1;
	  Set<Integer> s = new TreeSet<Integer>(c);
	  
	  s.add(5);
	  s.add(2);
	  s.add(1);
	  s.add(4);
	  
	  System.out.println(s);

	}
	
	
	
	
	

}
