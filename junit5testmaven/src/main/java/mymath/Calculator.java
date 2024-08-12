package mymath;

public class Calculator {
	
	private double op1,op2;

	public Calculator() {}
	public Calculator(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}
	
	public double add()
	{
		return this.op1 +  this.op2;
	}
	
	public double divide1()
	{
	    if(op2<=0)
	    {
	    	System.out.println("divisor op2:"+op2+" cant be 0 or -ve no!");
	    	return -1;
	    }
	    else
	    {
	    	return op1/op2;
	    }
	}

	public double divide2()
	{
	       	return op1/op2;
	    
	}
	
	public double remainder()
	{
	       	return op1%op2;
	    
	}

	public static int integerDivision(int dividend, int divisor)
	{

		if(divisor!=0)
		{
			return dividend/divisor;
			//  return dividend%divisor;

		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	/*
	public boolean isPrimeOp1()
	{
		
	}
*/
	@Override
	public String toString() {
		return "Calculator [op1=" + op1 + ", op2=" + op2 + "]";
	}
	
	
	
	

}
