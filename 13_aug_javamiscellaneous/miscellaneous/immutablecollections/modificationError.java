package miscellaneous.immutablecollections;// Java program to show
// ConcurrentModificationException 

import java.util.Iterator; 
import java.util.ArrayList; 

public class modificationError { 
	public static void main(String args[]) 
	{ 

		// Creating an object of ArrayList Object 
		ArrayList<String> arr 
			= new ArrayList<String>(); 

		arr.add("One"); 
		arr.add("Two"); 
		arr.add("Three"); 
		arr.add("Four"); 

		try { 
			// Printing the elements 
			System.out.println( 
				"ArrayList: "); 
			Iterator<String> iter 
				= arr.iterator(); 

			while (iter.hasNext()) { 

				System.out.print(iter.next() 
								+ ", "); 

				// ConcurrentModificationException 
				// is raised here as an element 
				// is added during the iteration 
				System.out.println( 
					"\n\nTrying to add"
					+ " an element in "
					+ "between iteration\n"); 
				arr.add("Five"); 
			} 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 
	} 
} 
