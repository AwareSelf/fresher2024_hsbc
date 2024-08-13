package miscellaneous.interfacedefaultstaticmethods;


/*
Java 8 introduces default methods to help with the problem of changing interfaces.
A new method added to an interface before default methods would cause all the classes
implementing that interface to break. Interfaces can have additional methods added to
them without the implementing classes having to submit an implementation due to default methods.

Default methods are declared using the default keyword in the method signature.
This keyword distinguishes default methods from regular abstract methods in interfaces.
 */

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Bounceable b = new Ball(4);
        b.bounce();
    }
}
interface Bounceable {
    public static int baseBF = 3;

    public void bounce();

    public default double getBounceFactor(double f) {
        return Bounceable.baseBF + (f * Math.random());
    }
}

class Ball implements Bounceable{
   double bouncefactor;
    Ball(double bf)
    {
        this.bouncefactor = this.getBounceFactor(bf);
    }

    @Override
    public void bounce() {
        System.out.println("Ball is bouncing with bounce factor:"+this.bouncefactor);
    }

    void roll()
    {
        System.out.println("Ball is rollling..");
    }


}
