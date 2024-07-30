package miscellaneous.recordex2;// Java Program to Illustrate Record's functionalities

// Main class
class MainApp {

// Main driver method
public static void main(String args[]) {

	// Creating object with default constructor
	Employee e1 = new Employee(1001, "Derok", "Dranf");

	// auto generated getter methods
	System.out.println(e1.id() + " " + e1.firstName()
					+ " " + e1.lastName());

	// Auto-generated toString() method
	System.out.println(e1);

	// Creating object with parameterized constructor
	Employee e2 = new Employee(1002, "Seren");

	// Using instance methods
	e2.getFullName();

	// Using static methods
	System.out.println("Employee " + e2.id()
					+ " Token = "
					+ e2.generateEmployeeToken());

	// Using the equals() method
	System.out.print("Is e1 equal to e2: "
					+ e1.equals(e2));
}
}
