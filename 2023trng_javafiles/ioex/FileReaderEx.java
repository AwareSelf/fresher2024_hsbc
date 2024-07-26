package ioex;

import java.io.*;

public class FileReaderEx{
	
	public static void main(String[] args) {
		
		FileInputStreamEx ob = new FileInputStreamEx();
		ob.fileio("src//ioex//Emp.java");
	}
	
	 void fileio(String filename)
	{
		File f = new File(filename);
		//read from char oriented .java file
		if(f.exists())
		{		
		try(Reader fr = new FileReader(f)) //byte oriented io
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
