package ioex;

import java.io.*;

public class FileInputStreamEx {
	
	public static void main(String[] args) {
		
		FileInputStreamEx ob = new FileInputStreamEx();
		ob.fileio("src//ioex//empdata1.dat");
	}
	
	 void fileio(String filename)
	{
		File f = new File(filename);
		//read from byte oriented .dat file
		if(f.exists())
		{		
		try(InputStream fr = new FileInputStream(f)) //byte oriented io
		{
		int no;
		while((no = fr.read())!=-1)
		{
			System.out.print((char)no);
		}
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	  }
	else
		{
			System.out.println("file "+filename +" does not exist at "
					+ "given location.."+f.getAbsolutePath());
		}
	}

}
