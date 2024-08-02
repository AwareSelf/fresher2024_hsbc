package multithreadingsynchro;

public class Account {

	private String accountHolderName;
	private int acctNo;
	private double balance;
	
	
	public Account(String accountHolderName, int acctNo, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.acctNo = acctNo;
		this.balance = balance;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAcctNo() {
		return acctNo;
	}

	
	public void deposit(double amt)
	{
		this.balance = this.balance + amt;
	}
	
	public double withdraw(double amt) throws InsufficientBalanceException,InterruptedException
	{
		System.out.println("Balance at entry:"+this.balance);
		
	
	synchronized(this) //get a lock on current account object (on which withdraw method is invoked)
	 {
		if(amt <= this.balance )
		{
			
			Thread.sleep(2000);
			
			System.out.println("current balance before deducting "+amt+" rs:"+this.balance);
			this.balance = this.balance - amt;
			System.out.println("Current Balance after deducting "+amt+"rs is"+ this.balance);
		}
		else
		{
			//System.out.println("Insufficient Balance: amt:"+amt+" is greater than your balance:"+this.balance);
			
			throw new InsufficientBalanceException(this.balance,amt,this.acctNo);
		}
     }	
		
		return amt;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", acctNo=" + acctNo + ", balance=" + balance + "]";
	}
	
	
	
	
	
}
