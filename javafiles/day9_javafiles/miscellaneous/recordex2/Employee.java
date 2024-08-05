package miscellaneous.recordex2;// Java Program Illustrating a Record class
// defining constructors, instance methods
// and static fields

// Record class
public record Employee(int id, String firstName,
                       String lastName)
{

    // Instance fields need to be present in the record's
    // parameters but record can define static fields.
    static int empToken;

    // Constructor 1 of this class
    // Compact Constructor
    public Employee
    {
        System.out.println("Employee compact constructor");
    }

    // Constructor 2 of this class
    // Alternative Constructor
    public Employee(int id, String firstName)
    {
        this(id, firstName, null);
    }

    // Instance methods
    public void getFullName()
    {
        if (lastName == null)
            System.out.println(firstName());

        else
            System.out.println(firstName() + " "
                               + lastName());
    }

    // Static methods
    public static int generateEmployeeToken()
    {
        return ++empToken;
    }
}

