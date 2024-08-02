package collections;

import java.util.*;

import inheritance.Emp;
import inheritance1.*;

public class MapEx {

	public MapEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map of emp with their names-salary
		Map<String,Double> mp = new HashMap<String,Double>();
		mp.put("Ram",5000.0);
		mp.put("Shyam",15000.5);
		mp.put("Ram",5000.4);
		mp.put("Keshav",25000.8);
		System.out.println(mp);
		System.out.println(mp.keySet());
		
		System.out.println("********************Map of Emp->Salary**************************************");
		
		Map<Emp,Double> mp1 = new HashMap<Emp,Double>();
		
        Emp e = new Emp(1,"Namrata",10000);
		mp1.put(e,e.getEmpSal());
		
		Emp e1 = new Emp(2,"Rahul",200000);
		mp1.put(e1,e1.getEmpSal());
		
		Manager m = new Manager(3,"Parag",120000,"Dev",10,10000);
		mp1.put(m,m.getEmpSal());
		
		Manager m1 = new Manager(4,"Abhishek",15000,"Dev",20,10000);
		mp1.put(m1,m1.getEmpSal());
		
		WageEmp we = new WageEmp(5,"Geeta",1000,100,50);
		mp1.put(we,we.getEmpSal());
		
		Emp ex = new Emp(1,"Namrata",100000);
		mp1.put(ex,ex.getEmpSal());
		
		System.out.println("map size:"+mp1.size());
		
		System.out.println(mp1);
		
		Set<Emp> st = mp1.keySet();
		System.out.println("all key values in the map:"+st);
		
		System.out.println(mp1.get(we));
		
		
		
		
		

	}

}
