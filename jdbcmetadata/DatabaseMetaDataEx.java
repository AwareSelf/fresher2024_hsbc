package jdbcmetadata;
import java.sql.*;

public class DatabaseMetaDataEx 
{
          public static void main(String args[])
          {                                     
			  try
			  {
		    Class.forName("com.mysql.jdbc.Driver");
				  
				 
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2?useSSL=false",
						"root","namrata"); 
			  
			DatabaseMetaData md=con.getMetaData();
			

			System.out.println("product name:"+md.getDatabaseProductName()); 
			System.out.println("product version:"+md.getDatabaseProductVersion());
			
			
			
			String DriverName=md.getDriverName();
			System.out.println("DriverName:"+DriverName);
 
			
     	  }
		  catch(SQLException ob)
		  {int no=ob.getErrorCode();
		    System.out.println("error code:"+no);
			ob.printStackTrace();
		  }
		  catch(Exception e)
		  {System.out.println("not a sql exception");
		  e.printStackTrace();
		  }
		
	}
		  

}
