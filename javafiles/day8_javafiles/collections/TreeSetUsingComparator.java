package collections;
import java.util.*;

import collections.model.Dept;
import collections.model.Emp;
import collections.model.Manager;

public class TreeSetUsingComparator {

	public static void main(String[] args) {
		//create a Comparator
		Comparator<Emp> c = new EmpComparator();
		//link it with treeset by passing it to TreeSet constructor
		Set<Emp> set = new TreeSet<Emp>(c);
		
		Dept d1 = new Dept(10,"HR");
		Dept d2 = new Dept(20,"Account");
		Dept d3 = new Dept(30,"Projects");
		
		Emp e1 = new Emp(1,"Ram",5000,d1);
		set.add(e1);
		
		Emp e2 = new Emp(2,"Shyam",6000,d1);
		set.add(e2);
		
		Emp e3 = new Emp(3,"Geeta",3000,d2);
		set.add(e3);
		
		Emp e4 = new Emp(4,"Meeta",3500,d2);
		set.add(e4);
		
		Emp e5 = new Emp(5,"Rahul",7500,d3);
		set.add(e5);
		
		
		Emp e6 = new Manager(6,"Namrata",8000,d2,"Training",10);
		set.add(e6);
		
		Emp e7 = new Emp(5,"Rahul",7500,d3);
		set.add(e7);
		
		
		//System.out.println(set);
		Iterator<Emp> it = set.iterator();
		while(it.hasNext())
		{
			Emp x = it.next();
			System.out.println(x);
		}

	}

}
