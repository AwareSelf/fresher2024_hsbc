package collectionsex;

import classesobjects.Emp;
import collectionsex.mycomparator.EmpNameComparator;
import collectionsex.mycomparator.EmpSalaryComparator;

import java.util.*;

public class TreeSetEx {

    public static void main(String[] args) {
        Set<String> s1 = new TreeSet<String>();
         s1.add("Neeraj");
         s1.add("Arman");
         s1.add("Manish");
         s1.add("Bharati");

        System.out.println(s1);

        Set<Emp> s2 = new TreeSet<Emp>();
        Emp e1 = new Emp(5,"Nisha",10000);
        Emp e2 = new Emp(1,"Neeta",20000);
        Emp e3 = new Emp(3,"Geeta",15000);
        s2.add(e1);
        s2.add(e2);
        s2.add(e3);
        System.out.println(s2);
        //create Comparator instance and pass it as an argument to TreeSet constructor
        // to link the Comparator with TreeSet
        Comparator c = new EmpSalaryComparator();
        Set<Emp> s3 = new TreeSet<Emp>(c);
        s3.add(e1);
        s3.add(e2);
        s3.add(e3);

        System.out.println(s3);

        c = new EmpNameComparator();
        s3 = new TreeSet<Emp>(c);
        s3.add(e1);
        s3.add(e2);
        s3.add(e3);

        System.out.println(s3);

    }
}
