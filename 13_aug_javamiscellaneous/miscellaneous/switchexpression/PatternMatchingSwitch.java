package miscellaneous.switchexpression;

public class PatternMatchingSwitch {
    public static void main(String[] args) {
        /*
        Pattern Matching in Switch Expressions:
    An experimental feature in Java 17 is pattern matching in switch expressions.
    With pattern matching, you can test whether an object is of a certain type, and
    if so, automatically cast it.
         */

        Object obj = "Hello World";

        String output = switch (obj) {
            case Integer i -> String.format("Integer: %d", i);
            case String s -> String.format("String: %s", s);
            default -> "Unknown object";
        };

        System.out.println(output); // Output: String: Hello World

        /*
        In this code snippet, obj is checked against each case.
        If obj is an instance of Integer, it is automatically cast to Integer (and assigned to i),
        and if obj is an instance of String, it's cast to String (and assigned to s).
        */
    }
}


