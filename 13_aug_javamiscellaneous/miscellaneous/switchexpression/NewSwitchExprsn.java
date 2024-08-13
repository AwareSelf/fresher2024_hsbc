package miscellaneous.switchexpression;

public class NewSwitchExprsn {
    public static void main(String[] args) {
        int day = 3;

        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            // ...
            default -> "Invalid day";
        };
        System.out.println(dayOfWeek);

        //using yield to return value from a switch case block.
        int day1 = 3;

        String dayOfWeek1 = switch (day1) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> {
                System.out.println("Processing Thursday...");
                yield "Thursday";
            }
            // ...
            default -> "Invalid day";
        };
        System.out.println(dayOfWeek1);
    }
}

/*
There are several things to note about this new syntax:

1) The switch expression returns a value, which we assign directly to the dayOfWeek variable.
2) We use an arrow (->) instead of a colon (:).
3) There’s no need for the break keyword, reducing verbosity and the potential for fall-through bugs.
4) The switch expression requires a default branch to ensure it always returns a value, thereby encouraging safer coding practices.

Yield Keyword
The new switch expressions also introduce the yield keyword.
This keyword is used when the logic of a case isn't a simple one-liner.
In such a scenario, we can't use the arrow syntax.
Instead, we switch back to using the colon and wrap our code block within braces,
but instead of break, we use yield to return the value.
 */
