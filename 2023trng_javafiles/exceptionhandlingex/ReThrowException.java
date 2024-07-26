package exceptionhandlingex;

import java.io.*;

//example of writing checked exception handling code in a fucntion and calling that function
public class ReThrowException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
		try
		{
		 func();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found at given location"+e);
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception while read.."+e);
			e.printStackTrace();
		}
	
		
		
		System.out.println("remaining program continues..");
		

	}
	
	
	public static void func() throws IOException
	{
		FileReader fr=null;
		try
		{
			 fr = new FileReader("C://def.java");
			
				 
			 fr.read();
		}
		catch(IOException e)
		{
			System.out.println("partially handling the exception "+e);
			System.out.println("rethrowing the checked exception using throw..");
			throw e;
		}
		finally
		{
			System.out.println("finally executed");
			if(fr!=null)
			fr.close();
		}
			 
		
		System.out.println("remaining program of func continues..");
	}

}
