package inheritance;

public class InheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m = new Manager(1,"Ram",5000,"Sales",10,10000);
         System.out.println(m);
         
         m.delegate();
        // System.out.println(m.calcAnnSal(50000));
         
         System.out.println(m.calcAnnSal());
         
        Emp ex = new Manager(3,"Shyam",7000,"Hr",5,20000);
        ex.calcAnnSal();
         
         
         m = new Manager();
         
        Emp e = new Emp(2,"Sita",5000);
        System.out.println(e);
        System.out.println(e.calcAnnSal());
	}

}
