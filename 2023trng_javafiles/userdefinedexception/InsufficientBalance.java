package userdefinedexception;

public class InsufficientBalance extends Exception{
	private int acctid;
	private double bal;
	private double amt;
	
	
	public InsufficientBalance(double bal,double amt,int acctid)
	{
		super("Insufficient balance for acctid="+acctid+
				  ".bal ="+bal +
				  ",amt ="+ amt);
		
		
		System.out.println("User-defined exception InsufficientBalance constructor called..");
		this.acctid = acctid;
		this.bal = bal;
		this.amt =  amt;
		
	}
	
	
	public String toString()
	{
		return "Insufficient balance for acctid="+this.acctid+
				  ".bal ="+this.bal +
				  ",amt ="+ this.amt;
	}

}
