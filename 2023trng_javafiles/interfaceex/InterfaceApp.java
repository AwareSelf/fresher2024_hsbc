package interfaceex;

public class InterfaceApp {

	public static void main(String[] args) {
		
		Bounceable b = new Ball(3,"red");
		b.setBounceFactor(5);
		b.bounce();
		
		func(new Ball(5,"green"));
        func(b);
	}
	
	
	static void func(Bounceable b)
	{
		b.bounce();
	}
	
	
	

}
