package layered.main;

import layered.bussiness.BussLayer;
import layered.exception.UnsuccesfulOperation;
import layered.model.Student;

public class MainApp {

	public static void main(String[] args) {
		
		
		BussLayer bl = new BussLayer();
		
		
		//take details of student using scanner
		
		bl.studentAdmission(20,"Rishi","Kapoor");
		
		//this is unchecke exception so try-catch is optional
		try
		{
		System.out.println(bl.getStudDetail(20));
		}
		catch(UnsuccesfulOperation e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		}
		

	}

}
