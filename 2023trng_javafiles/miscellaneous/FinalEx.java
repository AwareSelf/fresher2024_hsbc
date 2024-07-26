package miscellaneous;

import classesobjects.Emp;

class A
{
	//static final is compile time constant has to be initialized then and there
	static final double PI =  3.14; 

}
public class FinalEx {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(A.PI);
	//	System.out.println(A.PI++); //static final variable can't be modified
		
		//primitive variable is final
		final int no ;
		//static int nox = 7; //static variable cant be defined in method
		no=5;
		//no++;
		
		//object reference is final
		//final reference means it cannot re-point / re-reference to another
		//object but object can be modified via reference
		final Emp e ;
		e = new Emp(1,"Ram",5000);
		e.setEmpName("Rama");  //you can modify the object
	//	e = new Emp(2,"Sita",1000); //but you can't modify the reference
		
		Emp e1 = new Emp(3,"Mita",3000);
	//	e=e1; //e ref is final hence it can't be modified i.e. point to another object
		
		
		
		
		
		

	}

}
