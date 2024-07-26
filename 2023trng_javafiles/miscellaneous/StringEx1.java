package miscellaneous;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Namrata";
		
		name = name + " Marathe";
		//System.out.println(name+" Marathe");
		System.out.println(name);
		
		name = "Core ";
		name = name + "Java";
		//System.out.println(name.concat("Java"));
		System.out.println(name);
		
		name = "Core";
		StringBuilder sb = new StringBuilder(name);
		sb.append(" Java").append(" is my batch");
		System.out.println(sb);
		name = sb.toString();
		System.out.println(name);
		
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
		String s3 = new String("abc");
		System.out.println(s1==s3);
		
		
		String n ="abcdef hijk";
		n = n.toUpperCase();
		System.out.println(n);
		
		n = "  java ";
		System.out.println("xxx"+n+"xxx");
		n = n.trim();
		System.out.println("xxx"+n+"xxx");
		
		
		   String str5 = "\t    Namrata    \u2005";
	        System.out.println("xxx"+str5+"xxx");
	        System.out.println("xxx"+str5.trim()+"xxx");
	        System.out.println("xxx"+str5.strip()+"xxx");
	        
	        String str6 = "\t   Namrata    \u2005";
	        System.out.println("xxx"+str6.stripLeading()+"xxx");
	        
	        String str7 = "\t    Namrata    \u2005";
	        System.out.println("xxx"+str7.stripTrailing()+"xxx");
		
        System.out.println("checking String isBlank and isEmpty..");
	        String b = "";
	        System.out.println(b.isBlank());
	        System.out.println(b.isEmpty());
	        
	        b = "    ";
	        System.out.println("xxxx"+b+"xxx");
	        System.out.println(b.isBlank());
	        System.out.println(b.isEmpty());
	        
	        String multi = "Hi All \n This is java \n aaa \n bbb";
	        System.out.print(multi);
	        
	       Stream<String> stream = multi.lines();
	     //  System.out.println(stream.count());
	       
	       System.out.println("\n print all lines of multiline string..");
	       //collect all the values in a stream and add them to List
	       // and return that list.
	       List<String> lst = stream.collect(Collectors.toList());
	       System.out.println(lst);
	       System.out.println(lst.get(1));
	       
	       String s = "java ";
	       s = s.repeat(5);
	       System.out.println(s);
	       
	       double price = 12.4;
	       int no = (int)price;
	       
	       //using wrapper classes for conversion
	       Double pricee = price; // Double pricee = new Double(price); --autoboxing
	       
	       no = pricee.intValue();
	        System.out.println(no);
	      
	       //to convert double-string to double
	       String val ="12.4";
	       double v = Double.parseDouble(val);
	       System.out.println(v);
	       
	       //to convert int-string to int
	       String val1="10";
	       int nx = Integer.parseInt(val1);
	       nx = nx+1;
	       System.out.println(nx);
	}

}
