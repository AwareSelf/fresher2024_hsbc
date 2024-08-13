package miscellaneous.interfacedefaultstaticmethods;

/*
Java 8 added static methods to interfaces in addition to default methods.
These methods can be invoked on the interface itself without requiring an instance of the interface;
they are comparable to static methods in classes. The purpose of adding static methods to
interfaces was to give a means of organizing similar utility methods inside the interface.
In contrast to default methods, static methods are not included in the interface's API for
implementing classes and do not rely on an instance of the interface.

practical usage:
Avoiding Utility Classes
Before Java 8, utility methods were often placed in utility classes.
With static methods in interfaces, there is no need to create separate utility classes just
for related static methods, leading to more cohesive code organization.
These techniques offer standard features that are not instance-specific.

 No Inheritance Conflicts

Static methods do not take part in more than one inheritance conflict,
in contrast to instance methods. Because static methods are called using the
interface name, there is no conflict if a class implements more than one interface
with the same static method.
*/

interface StringUtil {
    //other abstract or default string utility related methods that are instance specific
    // Static utility method
    static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}

interface MyMath {
    // Abstract method
    int calculate(int a, int b);
    // Static method in interface
    static double squareRoot(int num) {
        return Math.sqrt(num);
    }
}

public class InterfaceStaticMethod {

    public static void main(String[] args) {
        StringUtil.isNullOrEmpty("");

        MyMath m = new Calculator();
        int result = m.calculate(5, 3);
        System.out.println("Result: " + result);

        double sqrtResult = MyMath.squareRoot(25);
        System.out.println("Square root: " + sqrtResult);
    }
}


class Calculator implements MyMath {
    public int calculate(int a,int b) {
       return a+b;
    }
}
