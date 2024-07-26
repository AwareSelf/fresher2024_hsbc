package singleton;

public class MainApp {

	public static void main(String[] args) {
	Restaurant r1 = Restaurant.getSingleton();
	System.out.println(r1);
	
	Restaurant r2 = Restaurant.getSingleton();
	System.out.println(r2);
	
	
	
	if(r1.equals(r2)) //Objects equals should be used (it uses == )
	{
		System.out.println("Restaurant obj is singleton");
	}
	
	if(r1==r2)
	{
		System.out.println("Restaurant obj is singleton");
	}
	
  }

}
