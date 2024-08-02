package ioex;

import java.io.File;
import java.io.IOException;

public class FileClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
		File f1 = new File("src//ioex//Empx.java");
		
		
		
		if(!f1.exists())
		{
			f1.createNewFile();
		}
		
		
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println("get path name of file:"+f1.getAbsoluteFile());
			
	
		File f2 = new File("src//ioex//Empy.java");
		f1.renameTo(f2);
		System.out.println("get path name of file:"+f2.getAbsoluteFile());
		//f2.delete();
		//System.out.println(f2.exists());
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
