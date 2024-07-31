package exceptionhandlingex;

import java.io.*;

public class Exceptionex0 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  //try with resource(java 1.7 version onwards) can auto-close more than one resource
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
		
	
		
		
		System.out.println("remaining program continues..");
		

	}

}
