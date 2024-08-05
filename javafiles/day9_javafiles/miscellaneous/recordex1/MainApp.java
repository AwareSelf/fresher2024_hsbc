package miscellaneous.recordex1;

// Creating Employee object and showcasing its use cases

// Main class
public class MainApp {

    // Main driver method
    public static void main(String args[]) {

        // Creating object with default constructor
        Employee e1 = new Employee(1001, "Derok", "Dranf");

        // Auto generated getter methods
        // e1ref.propertName();
        System.out.println(e1.id() + " " + e1.firstName()
                + " " + e1.lastName());

        // Auto-generated toString() method
        System.out.println(e1);
    }
}