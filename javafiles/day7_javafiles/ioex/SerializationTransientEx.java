package ioex;

import java.io.*;

public class SerializationTransientEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("c:/tempp/empobj.ser");
		
		Department d1 = new Department(10,"Training",5);
				
		MyDate today = new MyDate(6,9,2022);
		
		Emp e = new Emp(1,"Ram",5000,d1,today);
			System.out.println(e);
		
		try(FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			//	ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(f));	
				)
			
         {
        	
	
			 System.out.println("before serializing Employee e:-"+e);
        	 oo.writeObject(e);
			
	
         }
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		
		
		e.setSalary(10000);
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
	        	 
	        	 
	        	 System.out.println(ee.getDept().getDeptname());
	        	 
	        	 //transient propery will be null when you deserialize the object back
	        	 //so you have to explicitly initialize it again before calling any member methods or it will throw NullPointerException
	        	//  ee.setJoinDate(new MyDate(8,9,2022));
	        	
	        	 System.out.println(ee.getJoinDate().getDate());
				
		
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
