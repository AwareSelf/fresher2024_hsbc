package ioex1;

import classesobjects.Emp;
import ioex.Employee;

import java.io.*;


public class SerializationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("c:/tempp/empobj.ser");
		
		 Emp e = new Emp(1,"Ram",5000);
		
		try(FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			//	ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(f));	
				)
		  { 	
	
			 System.out.println("before serializing Employee e:-"+e);
             e.setEmpSal(6000);
        	 oo.writeObject(e);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
			
		e.setEmpSal(9000);
		System.out.println("after serialization changing salary to 10000:-"+e);
		
		
		
		System.out.println("deserializing the employee object back...");
		
		try(
				InputStream in  = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(in);
				
				//	ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));	
					)
				
	         {
			 
	        	 Employee ee =(Employee) oi.readObject();
	        	 
	        	 System.out.println("After deserializing Employee:-"+ee);
				
		
	         }
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			catch(ClassNotFoundException ex)
			{
				ex.printStackTrace();
			}
		

	}
}
