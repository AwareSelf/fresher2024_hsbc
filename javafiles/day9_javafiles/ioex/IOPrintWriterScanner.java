package ioex;

import java.util.Scanner;

import java.io.*;

public class IOPrintWriterScanner {

	
	//read id, name and salry and write to a file using printwriter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);
	 
		 System.out.println("enter emp record:");
		
		 
		 int id = -1;
		 String name = null;
		 double salary = 0.0;
		 
		 System.out.println("enter id:");
		if(sc.hasNextInt())
			id = sc.nextInt();
				
		 System.out.println("enter name:");
		 
		  if(sc.hasNext())
			name = sc.next();
					
			 
		 System.out.println("enter salary:");
		 if(sc.hasNextDouble())
		    salary = sc.nextDouble();
		 
		 sc.close();
		 
		 
		 File f = new File("c:/tempp/emprec.dat");
		 
		 try(PrintWriter pw = new PrintWriter(f))
		 {
			 
			 pw.print(id);
			 pw.print(" ");
			 pw.print(name);
			 pw.print(" ");
			 pw.print(salary);
			 
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 
		 
						
				 
		
		
	

	}

}
