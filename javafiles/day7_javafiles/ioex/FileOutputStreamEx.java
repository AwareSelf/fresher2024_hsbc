package ioex;
import java.io.*;
import java.util.Scanner;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		String yesno="no";
	  //write byte stream to file
	    File f = new File("src//ioex//empdata2.dat");
		try(OutputStream fo = new FileOutputStream(f);
				Scanner sc = new Scanner(System.in);)
		{	
			String s=null;
			
			
			do
			{
			System.out.println("enter marks of 5 students separeated "
					+ "by space");
			s = sc.nextLine();
		    fo.write(s.getBytes());
		    
		    System.out.println("do u wish to conitinue:(yes/no)");
		    yesno = sc.nextLine();
		    }while(yesno.toLowerCase().equals("yes"));
			
		}
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
		
		//read the same file and show it on console
		try(InputStream fi = new FileInputStream(f))
		{
			int ch;
					while((ch = fi.read())!=-1)
					{
						System.out.print((char)ch);
					}
				
	    }
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
			
	}

}
