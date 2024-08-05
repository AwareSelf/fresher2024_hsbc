package usingdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateToString {
	
	
	public static void main(String[] args) {
		
		
		//convert date to string in specified format
		Date d = new Date();
		
		System.out.println(d);
		
		
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		//converting Date type object to String in specific format
		String s = sf.format(d);
		
		System.out.println(s);
		
        sf = new SimpleDateFormat("dd-MM-yyyy");
		
		String s1 = sf.format(d);
		
		System.out.println(s1);
		
	     sf = new SimpleDateFormat("hh:mm:ss");
		
		 System.out.println(sf.format(d));
		 
		 
		 
		 Date d1 = new Date(1981,4,16);
		 
		 SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			
			//converting Date type object to String in specific format
			s1 = sf1.format(d1);
			System.out.println("birthdate:"+s1);
			
			
		 
		 
		 
		 //convert string (given in specified format) to date
		 String sdt = "12/09/2022";
		 SimpleDateFormat s2 = new SimpleDateFormat("dd/MM/yyyy");
		 
		 try
		 {
		   Date dx = s2.parse(sdt);
		   System.out.println(dx);
		 }
		 catch(ParseException e)
		 {
			 e.printStackTrace();
		 }
		
	}

}
