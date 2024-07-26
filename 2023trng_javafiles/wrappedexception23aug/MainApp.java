package wrappedexception23aug;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 =new Emp(1,"Ram",5000);
		
		//kept array store size to 1 so as to generate
		//exception - Unsuccessful Operation (on purpose)
		EmpController empcntrl = new EmpController(1);
		try
		{
			
		empcntrl.addEmp(e1);
		
		//trying to save 2nd emp object in array of length 1
		//will generate exception 
		empcntrl.addEmp(e1);
		
		System.out.println(e1);
		
		}
		catch(Exception ex)
		{
			System.err.println(ex);
			
			System.err.println(ex.getCause().getMessage());
		}
		

	}

}
