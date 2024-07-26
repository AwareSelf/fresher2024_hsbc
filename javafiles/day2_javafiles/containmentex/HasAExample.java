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

        double d1 =3.4;
        float f = (float)3.4;
        float f1 = 3.4f;

        int no = 5;
        long l = 5;




    }
}
