package jdbc;


import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;

public class JdbcEx
{


 public static void main(String[] args) 
 {
		
		
	String s;
	try
	{
   //  Class.forName("org.postgresql.Driver");
		Class.forName("com.mysql.jdbc.Driver");  

    //  try(Connection con=DriverManager.
	//	  getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","namrata"); )
	try(Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/mydb1?useSSL=false","root","namrata"))  	
	  {
		
	    System.out.println("The connection is successful.");
	


        try(Statement stat=con.createStatement();)
		{
		 
		 s="create table student1(Rollno int,Name varchar(50),serName varchar(50))";
         stat.executeUpdate(s);
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		

         try(Statement stat1=con.createStatement();)
		{
 		 
      	 
      	 s="insert into student1 values(1,'Nitin','Marathe')";	
         int no=stat1.executeUpdate(s);
		 System.out.println("no of rows inserted:"+no);
		 s="insert into student1 values(2,'Abhi','Marathe')";
		 no=stat1.executeUpdate(s);
		 System.out.println("no of rows inserted:"+no);

		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		


      	System.out.println("create is successful:");



		try(Statement stat=con.createStatement();)
		{
			
		
         s= "update student1 set name='nikhil' where rollno=1";
		 
          int count = stat.executeUpdate(s);
          
          System.out.println("no of rows updated.."+count);

		}
		catch(Exception e) {
			e.printStackTrace();
		}





        try(Statement stat=con.createStatement();)
		{
		 
         s= "select * from student1";
         ResultSet rset=stat.executeQuery(s);
		
         while(rset.next())
        	 System.out.println(rset.getInt(1)+" "+rset.getString(2)+"    "+rset.getString(3));
			}
		 catch(SQLException e)
		 {   
			e.printStackTrace();
		 }
		
	  }//end of try block to get connection
      catch(SQLException e)
      {
    	  System.out.println("Coonection not created.."+e);
    	  e.printStackTrace();
      }
      
	 } //end of try to load driver class
     catch(ClassNotFoundException e)
     {
    	  System.out.println("SQL Driver class not found.");
     }

	}
}
