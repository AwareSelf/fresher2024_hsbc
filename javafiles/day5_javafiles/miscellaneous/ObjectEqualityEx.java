package miscellaneous;

import classesobjects.Emp;
import java.util.*;

public class ObjectEqualityEx {

    public static void main(String[] args)
    {
        int no = 4;
        int no1 = 4;
        System.out.println(no==no1);

        Emp e1 = new Emp(1,"Ram",5000);
        Emp e2 = new Emp(1,"Ram",5000);
        System.out.println("e1==e2:"+(e1==e2));
        System.out.println("e1.equals(e2):"+e1.equals(e2));

        Emp e3 = getEmp(e1);
        System.out.println("e1==e3:"+(e1==e3));
        System.out.println("e1.equals(e3):"+e1.equals(e3));

        Emp x = new Emp(2,"Rahul",10000);
        List<Emp> lst = new ArrayList<Emp>();
        lst.add(e1);
        lst.add(e2);
        System.out.println(lst);

        System.out.println("chk emp with id 1 present in the lst:"+lst.contains(new Emp(1,"Ram",5000)));


        System.out.println("runtime poly:equals:ex.equals(e4)");
        Object ex = new Emp(1,"Ram",5000);
        Emp e4 = new Emp(1,"Ram",5000);
        System.out.println("ex==e4:"+(ex==e4));
        System.out.println("ex.equals(e4):"+ex.equals(e4));
     }
    static Emp getEmp(Emp e)
    {
        return e;
    }
}
