package collections;
import java.util.*;
import java.util.stream.Collectors;

import inheritance.Emp;
import inheritance1.*;

public class ListEx {

	public ListEx() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args)
	{
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		
		int i = 10;
		
		l.add(i); // int --> Integer  new Integer(i); //auto-boxing
		
		
	    System.out.println(l.get(0) + l.get(1));  //auto-unboxing
	    
	    System.out.println(l.size());
		System.out.println(l.contains(200));
		
		System.out.println(l);
		
	    l.set(0,101);
	    System.out.println(l);
	    
		l.clear();
		System.out.println(l.size());
		System.out.println(l);
		
		/*************************************************************************/
		List<Emp> l1 = new ArrayList<Emp>(5);
		
		Emp e = new Emp(1,"Namrata",100000);
		l1.add(e);
		Emp e1 = new Emp(2,"Rahul",200000);
		l1.add(e1);
		Manager m = new Manager(3,"Parag",120000,"Dev",10000,5);
		l1.add(m);
		Manager m1 = new Manager(4,"Abhishek",15000,"Dev",10000,15);
		l1.add(m1);
		l1.add(new WageEmp(5,"Geeta",1000,100,50));
		
		Emp p = l1.get(0);
		
		System.out.println(l1);
		System.out.println("same ref of emp:"+l1.contains(e));
		System.out.println("copy of emp e represents same emp:"+l1.contains(new Emp(1,"Namrata",100000)));
		
		meth(l1);
		
		System.out.println("displaying the list of emps using forEach method..");
		l1.forEach(el->System.out.println(el)
				
				
				); //lambda func as callback java 1.8
		
		double totSal =0;
		Iterator<Emp> it = l1.iterator();
		while(it.hasNext())
		{
			Emp ele = it.next();
			System.out.println(ele);
			totSal += ele.getEmpSal();
		}
		System.out.println("Total salary of all emps is "+totSal);
		
		
		
		
	//	l1.stream().map(ex->ex.getSalary()).collect(Collectors.summingDouble(Double::doubleValue));
		
	}
	
	static void meth(List<Emp> x)
	{
		System.out.println("copy of emp e represents same emp:"+x.contains(new Emp(1,"Namrata",100000)));
	}
	

}
