package miscellaneous;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		Stream<String> lines = multilineString.lines();
		System.out.println(lines);
	
		
		List<String> lst = lines.collect(Collectors.toList());
		System.out.println(lst);
		
		String s = "";
		boolean isBlank = s.isBlank();
		System.out.println(isBlank);
		
		 // test case 1
        String str1 = " namrata ";
        System.out.println(str1.trim().equals(str1.strip())); // return --> true

        // test case 2
        final String str2 = "namrata \u2005";  // Unicode of white-space
        System.out.println(str2.trim().equals(str2.strip())); // return --> false
        
        String str5 = "\t    Namrata    \u2005";
        System.out.println("xxx"+str5+"xxx");
        System.out.println(str5.strip());
        
        String str6 = "\t   Namrata    \u2005";
        System.out.println("xxx"+str6.stripLeading()+"xxx");
        
        String str7 = "\t    Namrata    \u2005";
        System.out.println("xxx"+str7.stripTrailing()+"xxx");

        str1 = "Namrata Marathe";
        String result1 = str1.repeat(5);
        System.out.println(result1);

	}

}
