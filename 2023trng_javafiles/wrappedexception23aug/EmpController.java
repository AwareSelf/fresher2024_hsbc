package wrappedexception23aug;

import java.sql.SQLException;

public class EmpController {
	
	EmpDaoIntf d;
	
	public EmpController(int size)
	{
		
	
	   	 d = new StorageFactory().getStorage(1,size);
	   	 
	   	 
	}
	
	
	   boolean  addEmp(Emp e) throws UnsuccessfulOperation //SQLException
	     {
	    	
	    	  try
	    	  {
	    	    d.save(e);
	    	  }
	    	  catch(Exception ex)
	    	  {
	    		  System.out.println("exception occure while saveing emp to database");
	    		//  throw ex;
	    		  
	    		  throw new UnsuccessfulOperation("UnsuccessfulOperation",ex);
	    	  }
	    	  return true;
	     }

}
