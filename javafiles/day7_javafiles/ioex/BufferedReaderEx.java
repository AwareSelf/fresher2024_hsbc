package ioex;

import java.io.*;

public class BufferedReaderEx {
	
	
	public static void main(String[] args) {
		
		
	//	fileio("src/classesobjects/Employee.java");
		fileio1("src/classesobjects/Employee.java");
	}
	
	
	
	static void fileio(String filename)
	{
		//read from charachter based .java file
		
		try(Reader fr = new FileReader(filename))
		{
		
		
		int ch;
		while((ch = fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		
	
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	static void fileio1(String filename)
	{
		//read from charachter based .java file
		
		//nesting of io classes
	//	BufferedReader	br = new BufferedReader(new FileReader(filename));
		
		try(Reader r = new FileReader(filename);
				BufferedReader	br = new BufferedReader(r);)
		{
		
		
		String str;
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		
	
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
