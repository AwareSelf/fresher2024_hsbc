package collectionsex.mycomparator;

import java.util.*;
import classesobjects.Emp;


public class TreeMapEx {
    public static void main(String[] args) {

        SortedMap<Emp,Double> smap = new TreeMap<Emp,Double>();

        Emp e1 = new Emp(5,"Nisha",10000);
        Emp e2 = new Emp(1,"Neeta",20000);
        Emp e3 = new Emp(3,"Geeta",15000);
        Emp e4 = new Emp(2,"Asha",35000);

        smap.put(e1,e1.computeAnnSal());
        smap.put(e2,e2.computeAnnSal());
        smap.put(e3,e3.computeAnnSal());
        smap.put(e4,e4.computeAnnSal());
        System.out.println(smap);

        System.out.println(smap.get(new Emp(3,"Geeta",15000)));

        Comparator<Emp> c = new EmpSalaryComparator();
        SortedMap<Emp,Double> smap1 = new TreeMap<Emp,Double>(c);
        smap1.put(e1,e1.computeAnnSal());
        smap1.put(e2,e2.computeAnnSal());
        smap1.put(e3,e3.computeAnnSal());
        smap1.put(e4,e4.computeAnnSal());
        System.out.println(smap1);




    }
}
