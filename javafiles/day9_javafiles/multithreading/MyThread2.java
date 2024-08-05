package multithreading;

public class MyThread2 implements Runnable{
	
	public void run()
	{
		for(int k=1;k<100;k++)
		{
			
	System.out.println(Thread.currentThread().getName()+" k:="+k);
	
	     try
	     {
	
	       Thread.sleep(1000);
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
	     
		}
	}

}
