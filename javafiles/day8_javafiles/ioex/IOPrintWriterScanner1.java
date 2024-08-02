package ioex;

import java.util.Scanner;

import java.io.*;



public class IOPrintWriterScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reading a file using scanner and reading a emp record from it
		 Scanner sc = null;
		 
		try
		{
		 File f = new File("c:/tempp/emprec.dat");
		 
		 if(f.exists())
		   sc = new Scanner(f);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		 
		 int id = -1;
		 String name = null;
		 double salary = 0.0;
		 
		
		if(sc.hasNextInt())
		{	
			id = sc.nextInt();
		    System.out.println("emp id="+id);
		}
		
		 
		  if(sc.hasNext())
		  {
			  name = sc.next();
			  System.out.println("emp name="+name);
		  }
					
			 
		
		 if(sc.hasNextDouble())
		 {
		    salary = sc.nextDouble();
		    System.out.println(salary);
		 }
		 
		 Empp ob = new Empp(id,name,salary);
		 
		 System.out.println(ob.calcAnnSalary());
		 System.out.println(ob);
		 sc.close();
		 
		 
	}

}
