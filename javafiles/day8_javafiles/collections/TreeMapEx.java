package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import collections.model.Dept;
import collections.model.Emp;
import multithreadingsynchro.Account;

public class TreeMapEx {

	public static void main(String[] args) {
		//empid-empname
		/*
		Map<Integer,String> tm =  new TreeMap<Integer,String>();
		tm.put(105,"Ram");
		
		Emp e = new Emp(1,"Ram",5000);
		tm.put(e.getEmpId(),e.getEmpName());
		
		tm.put(12, "Geeta");
		tm.put(12,"Meeta");
		
		System.out.println(tm);
		
       Map<Emp,Account> mp = new TreeMap<Emp,Account>();
		
		Account ob = new Account("Ram",10,2500.0);

		Dept d1 = new Dept(10,"HR");
		Emp e1 = new Emp(2,"Ram",5000,d1);
		
		mp.put(e1, ob);
		
		Account ob1 = new Account("Shyam",20,2500.0);
		Emp e2= new Emp(1,"Shyam",15000,d1);
		
		mp.put(e2, ob1);
		
		System.out.println(mp);
		*/
		//treemap with comparator
		
		Comparator<Emp> c = new EmpComparator();
		 Map<Emp,Account> mp1 = new TreeMap<Emp,Account>(c);
			
			Account ob11 = new Account("Ram",10,2500.0);

			Dept d11 = new Dept(10,"HR");
			Emp e11 = new Emp(2,"Ram",25000,d11);
			
			mp1.put(e11, ob11);
			
			Account ob12 = new Account("Shyam",20,2500.0);
			Emp e21= new Emp(1,"Shyam",15000,d11);
			
			mp1.put(e21, ob12);
			
			System.out.println(mp1);
		
		
		

	}

}
