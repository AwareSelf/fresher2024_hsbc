package miscellaneous;

import classesobjects.Emp;

public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("no of emp objects:"+Emp.getCount());
		System.out.println("no of emp objects:"+Emp.incrCount());
		Emp e = new Emp(1,"Ram",6000);
		System.out.println("no of emp objects:"+Emp.getCount());
		//System.out.println(e.getCount()); //compiler allows it but don;t write it this way
	  
		e = new Emp(1,"Ram",6000);
		System.out.println("no of emp objects:"+Emp.getCount());
	
	}

}
