package miscellaneous;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMethodsEx {

    public static void main(String[] args)
    {
        String s = "core java";
       char ch = s.toUpperCase().charAt(0);
        System.out.println(ch);
        System.out.println(s);
     byte[] barr =  s.getBytes();
        String s1 = new String(barr);
        System.out.println(s1);

        System.out.println("splitting multiline string into separate lines of string object..");
        String multiline = "namrata is faculty\n radha is good girl\n srilata is my friend\n meeta is a student";
        System.out.println(multiline);
        Stream<String> strm = multiline.lines();

        List<String> lst = strm.collect(Collectors.toList());
        System.out.println(lst);
        System.out.println(lst.get(1));

        System.out.println("isBlank vs isEmpty...");
        String bb = "   ";
        System.out.println(bb.isBlank()); //true
        System.out.println(bb.isEmpty()); //false

        bb="";
        System.out.println(bb.isBlank());
        System.out.println(bb.isEmpty());

        String coursename = " Core Java  ";
        System.out.println("---"+coursename+"-----");
        coursename = coursename.trim();
        System.out.println("---"+coursename+"-----");

        coursename = " Core Java  ";
        System.out.println("---"+coursename+"-----");
        coursename = coursename.strip();
        System.out.println("---"+coursename+"-----");

        String str = "Core Java";
        boolean b = str.contains(" Java");
        System.out.println(b);
        System.out.println(str.indexOf("Java"));




    }
}
