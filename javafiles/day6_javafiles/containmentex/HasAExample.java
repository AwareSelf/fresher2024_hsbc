package containmentex;

public class HasAExample {

    public static void main(String[] args)
    {
        Dept d = new Dept(10,"Accounts");
        Emp e = new Emp(12,"Nisha",10000,d);

        System.out.println(e);


        //display Nisha's department name
        Dept dd = e.getEmpdep();
        System.out.println(dd.getDeptName());

        //display Nisha's department name - in one line by method chaining
        System.out.println(e.getEmpdep().getDeptName());


        float f = 12.3f;
        float f1 = (float)12.3;

        long l = 12;
        short s = 12;
        System.out.println(s);

        int ch = 'A';
        System.out.println(ch);







    }
}