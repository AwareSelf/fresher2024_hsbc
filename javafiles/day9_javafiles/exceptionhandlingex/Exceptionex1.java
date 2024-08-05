package exceptionhandlingex;

import java.io.*;

public class Exceptionex1 {

	public Exceptionex1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		File f = new File("C://java18oct//Goodrej_Java_Training_Basics//src//apppkg//MainApp.java");
		
//	if(f.exists())
//	{		
		try
		{
		 fr = new FileReader(f);
		 int ch;
			while((ch = fr.read())!=-1)
			{
				System.out.print((char)ch);
			}
			
		
		//return some value
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File with name "+f.getName()+
					" is not found at location"+f.getAbsolutePath());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block..");
			try
			{
			if(fr!=null)
			  fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		/*	}
	else
	{
		System.out.println("file does not exists!");
	}
		*/	
		
		
		System.out.println("remaining program continues..");
		

	}

}
