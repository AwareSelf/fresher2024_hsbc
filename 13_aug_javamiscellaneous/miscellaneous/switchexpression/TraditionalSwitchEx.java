package miscellaneous.switchexpression;

import java.sql.SQLOutput;

public class TraditionalSwitchEx {
    public static void main(String[] args) {
        int day = 3;
        String dayOfWeek;


        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            // ...
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        System.out.println(dayOfWeek);
    }
}


//https://medium.com/@AlexanderObregon/delving-into-java-17s-new-switch-expressions-76b282406533
