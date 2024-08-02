package layered.dao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

import layered.daointf.DaoIntf;
import layered.exception.StudentNotFound;
import layered.model.Student;

public class DaoImpJdbc implements DaoIntf {
	
	Set<Student> set;
	
	
	public DaoImpJdbc()
	{
		this.set =  new HashSet<Student>();
	}
	
	
	public Connection getConnection()
	{
		try
		{
		  Class.forName("com.mysql.jdbc.Driver");
		  
		  //step 2: get jdbc connection
	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2?useSSL=false",
				"root","namrata");
	       
	       if(con!=null)
	       {
	    	   System.out.println("connection successful");
	       }
	       else
	       {
	    	   System.out.println("connection not successful"); 
	       }
	       
	       return con;
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	    
		return null;
		   
	}
	
	public void closeConnection(Connection con)
	{
		if(con!=null)
		{
			try
			{
			  con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	

	@Override
	public void saveStudent(Student s) {
	
		Connection con = getConnection();

	  if(con!=null)
	   {
		String str = "insert into student values(?,?,?)";
		
		try(PreparedStatement p = con.prepareStatement(str))
		{
			p.setInt(1,s.getRollNo());
			p.setString(2, s.getFirstName());
			p.setString(3,s.getLastName());
			
			int count = p.executeUpdate();
			System.out.println("inserted "+count+" no of rows");
			
			this.set.add(s);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
		   closeConnection(con);
		}
	   }
	  else
	  {
		  System.out.println("conn is null in saveStudent");
	  }
		
		
		
	}

	@Override
	public Student getStudent(int studId) throws StudentNotFound {
		Connection con = getConnection();

		  if(con!=null)
		   {
			String str = "select * from student where rollno=?";
			
			try(PreparedStatement p = con.prepareStatement(str))
			{
				p.setInt(1,studId);
				
				ResultSet rs = p.executeQuery();
				
				while(rs.next())
				{
					int rollno = rs.getInt(1);
					String fn = rs.getString(2);
					String ln = rs.getString(3);
				
					Student stud = new Student(rollno,fn,ln);
				
					this.set.add(stud);
				    return stud;
					
				}
			
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
			   closeConnection(con);
			}
		   }
		  else
		  {
			  System.out.println("conn is null in getStudent");
		  }
		  
		  throw new StudentNotFound("student with id="+studId+" not found");
			
	}

}
