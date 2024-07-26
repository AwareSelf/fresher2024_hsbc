package miscellaneous;

import classesobjects.Emp;

public class PassByRef {

	public static void main(String[] args) {

	 Emp e = new Emp(1,"Sita",5000);
	
	 int no = 6;
	 
	// PassByRef.func(no);
	 func(no);
	 System.out.println(no);
	 
	 System.out.println(e);
	 func1(e);
	 System.out.println(e);

	}
	
	//pass by  value - the change is lost
	// if not returned and collected back in same variable
	static void func(int no)
	{
		no = no + 5;
	}

	//pass by ref
	static void func1(Emp o)
	{
		double s = o.getEmpSal() + 5000;
		o.setEmpSal(s);
	}
}

class B
{
	void meth()
	{
		PassByRef.func(5);
	}
}