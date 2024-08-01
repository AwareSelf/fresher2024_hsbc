package miscellaneous;

public class StaticBlockEx {

    static int ct;

  static {
        ct=0;
      System.out.println("1st static block called..");
    }
    static {

        System.out.println("2nd static block called..");
    }


    public static void meth()
    {
        System.out.println("static method called..");
        ct++;
    }
    public static void main(String[] args) {
      StaticBlockEx.meth();
    }
}
