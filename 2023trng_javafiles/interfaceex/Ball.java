package interfaceex;

public class Ball implements Bounceable {
	
	int bounceFactor;
	String color;
	
	
	
	public Ball(int bounceFactor, String color) {
		super();
		this.bounceFactor = bounceFactor;
		this.color = color;
	}


	public void setBounceFactor(int bf)
	{
		this.bounceFactor = this.bounceFactor * bf;
	}
	
	
	public void bounce()
	{
		System.out.println("Ball is bouncing with "
				+ "bounce-factor:"+this.bounceFactor);
	}
	
	

}
