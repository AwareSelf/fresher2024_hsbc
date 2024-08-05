package multithreading;

public class MyThread1 extends Thread {

	
	public MyThread1(String threadname)
	{
		super(threadname);
	}
	
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			
	System.out.println(Thread.currentThread().getName()+" i:="+i);
	
	     try
	     {
	
	       Thread.sleep(5000);
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
	     
		}
	}
}
