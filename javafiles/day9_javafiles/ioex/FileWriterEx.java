package ioex;
import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {


	    try
	    {
		FileWriter fw = new FileWriter(new File("c:/tempp/output.txt"));
		
		fw.write("hi how are you?");
		
		
		fw.close();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}

}
