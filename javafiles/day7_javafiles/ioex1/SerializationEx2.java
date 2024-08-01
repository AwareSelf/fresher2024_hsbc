package ioex1;

import containmentex.Emp;
import containmentex.Dept;
import ioex.Employee;

import java.io.*;


public class SerializationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("c:/tempp/empobj.ser");

		Dept d = new Dept(10,"Accounts");
		 Emp e = new Emp(1,"Ram",5000,d);
		
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
			 
	        	 Emp ee =(Emp) oi.readObject();
	        	 
	        	 System.out.println("After deserializing Employee:-"+ee);
               //emp comes back with its dept property set to null as emp's dept was marked as transient
				 //so set the emp's dept ref to the same dept object as below
				 ee.setEmpdep(d);
				 System.out.println("After deserializing Employee:-"+ee);
				 System.out.println(ee.getEmpdep().getDeptName());
				
		
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
