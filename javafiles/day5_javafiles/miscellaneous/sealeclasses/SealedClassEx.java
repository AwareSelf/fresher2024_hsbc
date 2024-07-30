package miscellaneous.sealeclasses;

import java.lang.*;

sealed class Vehicle permits TwoWheeler,FourWheeler,Truck
{
    public void printName()
    {
        System.out.println("Default- Vehicle type");
    }
}

non-sealed class TwoWheeler extends Vehicle
{
    public void printName()
    {
        System.out.println("Type of Vehicle:TwoWheeler");
    }
}

sealed class FourWheeler extends Vehicle permits DieselFourWheeler
{
    public void printName()
    {
        System.out.println("FourWheeler..");
    }
}

non-sealed class DieselFourWheeler extends FourWheeler
{

}

final class Truck extends Vehicle
{
    public void printName()
    {
        System.out.println("FourWheeler..");
    }
}



public class SealedClassEx
{
    public static void main(String[] args)
    {
        Vehicle h1 = new TwoWheeler();
        h1.printName();

        h1 = new TwoWheeler();
        h1.printName();

        h1 = new Truck();
        h1.printName();


    }
}
