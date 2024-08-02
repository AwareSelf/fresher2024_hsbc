package collections;
import collections.model.*;
import multithreadingsynchro.Account;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<Emp,Account> mp = new HashMap<Emp,Account>();
		
		Account ob = new Account("Ram",10,2500.0);

		Dept d1 = new Dept(10,"HR");
		Emp e1 = new Emp(1,"Ram",5000,d1);
		
		mp.put(e1, ob);
		
		Account ob1 = new Account("Shyam",20,2500.0);
		Emp e2= new Emp(2,"Shyam",15000,d1);
		
		mp.put(e2, ob1);
		
		System.out.println(mp);
		
		Account t = mp.get(new Emp(2,"Shyam",15000,d1));
		System.out.println(t);
		
		Set<Emp> ks = mp.keySet();
		Iterator<Emp> it = ks.iterator();
		while(it.hasNext())
		{
			Emp e = it.next();
			System.out.println("key: emp="+e);
			Account a = mp.get(e);
			System.out.println("value: account="+a);
			
		}
		
	}

}
