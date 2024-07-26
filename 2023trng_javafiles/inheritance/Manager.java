package inheritance;


// use extends keyword to inherit from super class - Emp
public class Manager extends Emp {
	
	private int teamSize;
	private String mgrType;
	private double variablePay;
	
	Manager()
	{ 
		//compiler adds empty super() call as 1st line in this constructor
		//as we have not explicitly add super(...) call ourselves
		
		//when compiler adds empty super() call, it will search for
		// matching 0-arg Emp() constructor definition in super class i.e.- Emp class
		System.out.println("Manager 0 - argwala constructor called..");
	}
	
	Manager(int empId,String empName,double empSal,String mgrType,int teamSize,double variablePay)
	{
		//as we are adding our own super(..) , compiler wont insert empty super()
		super(empId,empName,empSal);
		System.out.println("Manager overloaded argwala constructor called..");
		this.mgrType = mgrType;
		this.teamSize = teamSize;
		this.variablePay = variablePay;
		
	}
	
	
	@Override
	public double calcAnnSal()
	{
		return super.calcAnnSal()+ this.variablePay;
	}
	
	public void delegate()
	{
		System.out.println("Manger "+ this.getEmpName()+" of type "+this.mgrType
				+" is delegating work to team of size:"+this.teamSize);
	}
	
	@Override
	public String toString()
	{
		return super.toString() +","+ this.teamSize + "," + this.mgrType;
	}
	
	
	
	

}
