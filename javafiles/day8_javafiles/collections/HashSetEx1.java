package collections;

import java.util.*;

import collections.model.Dept;
import collections.model.Emp;
import collections.model.Manager;

public class HashSetEx1 {

	Set<Emp> set;
	
	
	public HashSetEx1(Set<Emp> set)
	{
		this.set = set;
	}
	
	public static void main(String[] args) {
		
		
		HashSetEx1 ob = new HashSetEx1(new HashSet<Emp>());
		ob.addEmps();
		ob.displayAllEmps();

		Dept d2 = new Dept(20,"Account");
		
		Manager x = new Manager(6,"Namrata",8000,d2,"Training",10);
		boolean b = ob.checkEmp(x);
		if(b)
		{ System.out.println("Manager "+x.getEmpName()+" is present in the set"); }
		else
		{
			System.out.println("Manager "+x.getEmpName()+" is not present in the set");
		}
		
		b = ob.deleteEmp(x);
		if(b)
		{
			System.out.println("Manager "+ x.getEmpName()+" removed successfully");
			
		}
		System.out.println(ob.checkEmp(x));
		ob.displayAllEmps();
		
		 System.out.println("emp count:"+ob.getTotalEmps());
		 ob.removeAllEmps();
		 System.out.println("emp count:"+ob.getTotalEmps());
		
		
	}
	
	
	
	public void addEmps()
	{
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
		
	//	System.out.println(set);
			
		
		
	}
	
	public void removeAllEmps()
	{
		this.set.clear();
	}
	
	public int getTotalEmps()
	{
		return this.set.size();
	}

	public boolean checkEmp(Emp e)
	{
		boolean b = set.contains(e);
		System.out.println(b);
		return b;
	
	}
	
	public boolean deleteEmp(Emp e)
	{
		return set.remove(e);
	}
	
	public void addEmp(Emp e)
	{
		this.set.add(e);
		//this.set.add(12);
	}
	
	public void displayAllEmps()
	{
		//System.out.println(this.set);
		
		Iterator<Emp> it = this.set.iterator();
		while(it.hasNext())
		{
			Emp x = it.next();
			System.out.println(x);
		}
	}
}
