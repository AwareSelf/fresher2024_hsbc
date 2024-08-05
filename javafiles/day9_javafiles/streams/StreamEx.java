package streams;

import classesobjects.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

    public static void main(String[] args) {
        Emp e1 = new Emp(5,"Nisha",10000);
        Emp e2 = new Emp(1,"Asha",20000);
        Emp e3 = new Emp(3,"Geeta",15000);
        Emp e4 = new Emp(4,"Amit",15000);

        List<Emp> lst = new ArrayList<Emp>();
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        lst.add(e4);
        System.out.println(lst);

       List<Emp> lst1 = lst.stream()
                           .filter((e)->e.getEmpName().charAt(0)=='A')
                            .collect(Collectors.toList());
        System.out.println(lst1);




    }
}
