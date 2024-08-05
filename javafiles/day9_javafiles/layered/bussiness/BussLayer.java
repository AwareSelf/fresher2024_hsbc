package layered.bussiness;

import layered.dao.DaoFactory;
import layered.daointf.DaoIntf;
import layered.exception.StudentNotFound;
import layered.exception.UnsuccesfulOperation;
import layered.model.Student;

public class BussLayer {
	
	DaoIntf dao;
	
	public BussLayer()
	{
		this.dao = DaoFactory.getDaoImpl();
	}
	
	
	public void studentAdmission(int rollno,String firstname,String lastname)
	{
		Student s = new Student(rollno,firstname,lastname);
		this.dao.saveStudent(s);
		
	}
	
	public Student getStudDetail(int studId)
	{
		try
		{
		Student s = this.dao.getStudent(studId);
		return s;
		}
		catch(StudentNotFound e)
		{
			throw new UnsuccesfulOperation("unsuccesful get student opp",e);
		}
		
	}
	
	
	
	
	

}
