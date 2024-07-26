package wrappedexception23aug;

public class UnsuccessfulOperation extends RuntimeException {
	
	public UnsuccessfulOperation(String msg,Exception e)
	{
		super(msg,e);
	}
	
	
	public String toString()
	{
		return "Operation not successful";
	}

}
