package multithreadingsynchro;

public class BankingApp {

	public static void main(String[] args) {
		
		
		Account ob = new Account("NishaAndAditi",10,2500.0);
		
		Runnable r1 = new RunnableEx(ob);
		new Thread(r1).start();
		
		try
		{
		  ob.withdraw(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		catch(InsufficientBalanceException e)
		{
			System.err.println(e);
		}

	}

}
