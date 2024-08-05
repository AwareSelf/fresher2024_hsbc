package exceptionhandling;

import java.io.*;

public class Exception1 {

	public static void main(String[] args) {
		
		Exception1 ob = new Exception1();
		char c  = ob.func();
		System.out.println("read 1st char of file:"+c);
		System.out.println("remaining program continues...");

		
	}
	
	
	char func()
	{
		FileReader fr = null;
		try
		{
		
		 fr = new FileReader("C://tempp//abc.txt");
		int b = fr.read();
		System.out.println((char)b);
		return ((char)b);
	
		}
		catch(FileNotFoundException ex)
		{		
			//ex.printStackTrace();
			
			String exce = ex.toString();
			System.out.println(exce);
			
			Exception e  = (Exception) ex.getCause();
			if(e==null)
			{
				System.out.println("There is no cascaded exception/no exception that caused"
						+ " current exception..");
			}
			else
			{
				System.out.println("The cause for current exception is another exception as "+e);
			}
			
			//you can log the string exce using logger in a file
		  
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("finally block to close file resource..");
			if(fr!=null)
			{
				try
				{
				  fr.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		
		System.out.println("remaining program of function func continues...");
		
		return 'x';
	}

}
