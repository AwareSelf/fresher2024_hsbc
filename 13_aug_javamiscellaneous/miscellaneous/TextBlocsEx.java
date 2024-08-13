package miscellaneous;

/*
the Java 15 text blocks feature to declare multi-line strings most efficiently.
We all know that how we can declare multi-line strings and that too quite easily with the
help of concatenation, string’s join method, StringBuilder append method, etc.
Now the question will arise in our mind that if everything is this simple then what is the
need for a new feature i.e. text blocks to declare multi-line strings. So let’s first try
to understand the problem and then we will understand the need for a text block.

In earlier releases of the JDK, embedding multi-line code snippets required a tangled mess of
explicit line terminators, string concatenations, and delimiters. Text blocks eliminate most
of these obstructions, allowing you to embed code snippets and text sequences more or less as-is.

A text block is an alternative form of Java string representation that can be used anywhere
a traditional double-quoted string literal can be used. Text blocks begin with a “””
(3 double-quote marks) observed through non-obligatory whitespaces and a newline.
 */

public class TextBlocsEx {

    public static void main(String[] args) {
        // ORIGINAL
        String message = "A-143, 9th Floor, Sovereign Corporate Tower,\n" +
                "Sector-136, Noida,\n" +
                "Uttar Pradesh - 201305";

        System.out.println(message);
        // BETTER : Using text blocks
        // gets rid of lots of the clutter
        String message1 = """ 
	                    A-143, 9th Floor, Sovereign Corporate Tower, 
	                    Sector-136, Noida, 
	                    Uttar Pradesh - 201305""";

        System.out.println(message1);


        // Both message1 and message2 are strings of equal value
        System.out.println(message.equals(message1));    // true

        // Both text1 and text2 intern to the same string
        System.out.println(message == message1);         // true



        int no1 = 4;
        String text1 = "result:\n" +
                "The value of no1 is:"+no1;


        String text2 = """
                result:
                The value of no1 is:%d
                """.formatted(no1);
        System.out.println(text1);
        System.out.println(text2);

        /*
        as of now it doesn't support javascript/react like interpolation syntax yet
        String text2 = """
                result:
                The value of no1 is:${no1}
                """;
         */



    }
}
