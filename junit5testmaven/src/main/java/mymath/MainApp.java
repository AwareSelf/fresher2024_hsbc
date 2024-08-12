package mymath;

public class MainApp {

	public static void main(String[] args) {
		
		
		Calculator c = new Calculator(12,0);
		
		double r = c.divide2();
		System.out.println(r);
		
		r = c.remainder();
		System.out.println(r);
		
		double noo=12,noo1=0;
		System.out.println(noo/noo1);
		
		int no=12,no1=0;
		System.out.println(no/no1);
		
		

	}

}
