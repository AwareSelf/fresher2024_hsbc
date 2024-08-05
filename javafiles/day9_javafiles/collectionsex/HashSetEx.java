package collectionsex;

import containmentex.Dept;
import containmentex.Emp;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        Set<Emp> s = new HashSet<Emp>();

        Dept d = new Dept(10,"Accounts");
        Emp e = new Emp(1,"Nisha",10000,d);

        s.add(e);
        Dept d1 = new Dept(20,"Hr");
        e = new Emp(2,"Namita",5000,d1);
        s.add(e);

        e = new Emp(3,"Geeta",20,d1);
        s.add(e);

        Dept d3 = new Dept(30,"Infra");
        e= new Emp(4,"minal",6000,d3);
        s.add(e);

        e= new Emp(5,"mona",6000,d3);
        s.add(e);

        System.out.println(s);
        System.out.println(s.contains(new Emp(3,"Geeta",20,d1)));


    }
}
