package collectionsex.mycomparator;

import containmentex.Dept;
import containmentex.Emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        //Map interface does not extend from Collection interface
        Map<Emp,Double> map = new HashMap<Emp,Double>();

        Dept d = new Dept(10,"Hr");
        Emp e1 = new Emp(5,"Nisha",10000,d);
        Emp e2 = new Emp(1,"Neeta",20000,d);

        Dept d1 = new Dept(20,"Projects");
        Emp e3 = new Emp(3,"Geeta",15000,d1);

        map.put(e1,e1.computeAnnSal());
        map.put(e2,e2.computeAnnSal());
        map.put(e3,e3.computeAnnSal());
        System.out.println(map);

       boolean isPresent = map.containsKey(new Emp(1,"Neeta",20000,new Dept(10,"Hr")));
        System.out.println(isPresent);

        isPresent = map.containsKey(new Emp(11,"Lataa",20000,new Dept(10,"Hr")));

        Emp x = new Emp(1,"Neeta",20000,d);
        double annsal = map.get(x);  // value = map.get(key)
        System.out.println("Annual Salary of Emp:"+x.getEmpName()+" is:"+annsal);

        System.out.println(map.containsValue(240000.0));

        map.put(new Emp(3,"Geeta",15000,d1),9999.5);
        System.out.println(map);
        Set<Emp> set = map.keySet();

        Iterator<Emp> it = set.iterator();
        while(it.hasNext()) {
            Emp e = it.next();
            System.out.println(e+":"+map.get(e));
        }



    }
}
