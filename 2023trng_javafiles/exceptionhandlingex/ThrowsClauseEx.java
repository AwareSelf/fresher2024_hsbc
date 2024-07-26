package exceptionhandlingex;

import java.io.*;

//example of writing checked exception handling code in a fucntion and calling that function
public class ThrowsClauseEx {

	
	public static void main(String[] args)  {
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
			e.printStackTrace();
		}
		
	
		
		
		System.out.println("remaining program continues..");
		

	}
	
	
	public static void func() throws IOException
	{
		FileReader fr = new FileReader("C://abc.java");
				//	FileReader fr1 = new FileReader("C://def.java");
			
				 
			 fr.read();
			 
			 fr.close();
			
			 System.out.println("remaining func");
	}

}
