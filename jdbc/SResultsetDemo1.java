package jdbc;
import java.sql.*;
import javax.sql.*;
import java.io.*;
class SResultsetDemo1
{
	public static void main(String[] args) 
	{Connection con=null;
		 try{

			 
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 con=DriverManager.getConnection("jdbc:oracle:thin:@saraswati:1521:oracle10g","scott","tiger");
		
		
		
		

		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			try
		{
			 Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			 System.out.println(stmt);
			 
		 ResultSet rs= stmt.executeQuery("select * from scrollex");
		//	 while(rs.next())
				 		
		//	 System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getInt(3));

			
     		 rs.last(); 
			 System.out.println(rs.getString(1));
			 rs.first();
			 System.out.println(rs.getString(1)); 

			 rs.absolute(2);
System.out.println(rs.getString(1)); 
			
		 }
		 catch(Exception ce)
		  {
			 ce.printStackTrace();
			 			 System.out.println(ce);
		  }
		  
		
	}
}
