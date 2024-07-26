package java8;

public class RunnableLambda {
	
	
	public static void main(String[] args)
	{
		
		Runnable r = ()->{
			
			for(int j=0;j<100;j++)
			{
				System.out.println(Thread.currentThread().getName()+":"+j);
			  
				try
				{
				  Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		  };
		
		
		new Thread(r,"MyThread").start();
		
		
		
		
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
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
