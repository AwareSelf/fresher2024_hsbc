package exceptionhandlingex;

import java.io.*;

//example of writing checked exception handling code in a fucntion and calling that function
public class TryCatchInFunc {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
		
		 func();
	
		
		
		System.out.println("remaining program continues..");
		

	}
	
	
	public static void func()
	{
		try(FileReader fr = new FileReader("C://abc.java");
				//	FileReader fr1 = new FileReader("C://def.java");
			  ) 
			{
				 
			 fr.read();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found at given location!");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
	}

}
