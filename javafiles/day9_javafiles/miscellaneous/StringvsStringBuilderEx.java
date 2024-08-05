package miscellaneous;

public class StringvsStringBuilderEx {

   public static void main(String[] args)
   {
       String n = "namrata";
       System.out.println(n);
       n = n.concat(" Marathe");
       System.out.println(n);
       System.out.println("using string builder...");
      // StringBuilder sb = new StringBuilder("namrata");
       StringBuilder sb = new StringBuilder(n);
     n =  sb.append(" marathe").append(" is a java faculty")
                       .reverse().toString();

       System.out.println(n);

       String course = "core java";
       StringBuilder sb1 = new StringBuilder(course);
        course = sb1.append(" react").append(123).delete(1,4).toString();
       System.out.println(course);




   }
}
