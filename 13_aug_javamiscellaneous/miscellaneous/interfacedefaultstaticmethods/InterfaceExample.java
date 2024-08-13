package miscellaneous.interfacedefaultstaticmethods;

/*
Java 8 introduces default methods to help with the problem of changing interfaces.
A new method added to an interface before default methods would cause all the classes
implementing that interface to break. Interfaces can have additional methods added to
them without the implementing classes having to submit an implementation due to default methods.

Default methods are declared using the default keyword in the method signature.
This keyword distinguishes default methods from regular abstract methods in interfaces.
 */
interface MyInterface1{
   public static int num = 100;
   public default void display() {
      System.out.println("display method of MyInterface1");
   }
}
interface MyInterface2{  
   public static int num = 1000;
   public default void display() {
      System.out.println("display method of MyInterface2");
   }
}  
public class InterfaceExample implements MyInterface1, MyInterface2{
   public void display() {
      MyInterface1.super.display();
      //or,
      MyInterface2.super.display();
   }      
   public static void main(String args[]) {
      InterfaceExample obj = new InterfaceExample();
      obj.display();
   }
}
