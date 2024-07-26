package functionalinterfaceex.usinglambda;

public class UseInterface {

	public static void main(String[] args) {
		
	
		//interface ref = class instance that implements interface
		
		Bounceable b = new Ball();
		b.bounce();
		String s = b.getOverview();
		System.out.println(s);
		System.out.println(Bounceable.getBounceFactor());
		
		System.out.println("Implementing functional inetrafce \n using lambda");
		
		
		//if there is only one statement inside lambda function (body) then
		 //curly brackets could be omitted
		Bounceable b1 =  ()->System.out.println("Ball is bouncing");
		 b1.bounce();
		    String s1 = b1.getOverview();
		    System.out.println(s1);
		    System.out.println(Bounceable.getBounceFactor());
			    
		callfunc(()->System.out.println("Tyre is bouncing.."));               
	   

	}
	
	static void callfunc(Bounceable b)
	{
		b.bounce();
	}


}
