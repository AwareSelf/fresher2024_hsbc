package classesobjects;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 5,no1=5;
		System.out.println(no==no1);
		
		
		Emp e;  //declaring a reference
		e = new Emp(); //creating a object
		System.out.println(e);
		
		Emp ex = new Emp();
		System.out.println("e==ex:"+(e==ex));
		
		Emp e1 = new Emp(1,"Ram",1600);
		System.out.println(e1);  // e1.toString();
		System.out.println(e1.calcAnnSal());
		
		double annSal = e1.calcAnnSal();
		System.out.println("ann sal of emp e1:"+annSal);
		
		Emp e11 = new Emp(1,"Ram",1600);
		System.out.println("e==e1:"+(e1==e11));
		
		e1 = e11;
		System.out.println("after assigning e11 to e1, e==e1:"+(e1==e11));
		
		
		Emp e2 = new Emp(2,"Shyam",2600);
		System.out.println(e2);
	    System.out.println(e2.calcAnnSal());
		
		annSal = e2.calcAnnSal();
		System.out.println("ann sal of emp e2:"+annSal);
		
      //  e1 = e2;
		
		
		Emp x = new Emp(e2);
		System.out.println(x);
		
		Emp x1 = new Emp(13,"Akash",13000);
		double annsal = x1.calcAnnSal(40000);
		System.out.println(annsal);
		
		
		
	}

}
