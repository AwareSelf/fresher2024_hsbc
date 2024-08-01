package classesobjects;

public class HascodeEx {
    public static void main(String[] args) {
        Emp e1 = new Emp(1,"Ram",5000);
        Emp e2 = new Emp(1,"Ram",5000);

        System.out.println(e1==e2); //false
        System.out.println(e1.equals(e2)); //equals overriden in Emp //true

        //as hashCode method is not currently overriden it will
        // return diff values even if e1 and e2 are meaningfully same
        System.out.println(e1.hashCode()); //Object class hashCode method returns diff values if object in memory is not same
        System.out.println(e2.hashCode());

        /* we override hashCode method for meaningfully same objects so their hashCode
          method will return same value */
        System.out.println("after assigning e2 to e1...");
        e1 = e2;
        System.out.println(e1.hashCode()); //Object class hashCode method returns same values bcz e1 and e2 point to smae object in memory
        System.out.println(e2.hashCode());

    }
}
