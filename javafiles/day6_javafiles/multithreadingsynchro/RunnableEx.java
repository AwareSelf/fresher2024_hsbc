package multithreadingsynchro;

public class RunnableEx implements Runnable{
	
	Account act;
	
	public RunnableEx(Account act)
	{
		this.act = act;
	}
	
	public void run()
	{
		try
		{
     		act.withdraw(2000);
		
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
