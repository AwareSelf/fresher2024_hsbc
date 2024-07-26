package functionalinterfaceex.usinglambda;

@FunctionalInterface
public interface Bounceable {
	
	int BF=5; //it is public static final by default
	          // it has to be initialized then and there
	
	void bounce();
	//void bounce1();
	
	default String getOverview()
	{
		return "Bounceable implements bouncing feature";
	}

	
	static int getBounceFactor()
	{
		return BF;
	}
	//it can have other static and default methods
	// but only one abstract method
}

class Ball implements Bounceable
{

	@Override
	public void bounce() {
		System.out.println("Ball is bouncing...");
		
	}
	
}


