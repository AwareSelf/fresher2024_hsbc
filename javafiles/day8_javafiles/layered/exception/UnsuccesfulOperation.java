package layered.exception;

public class UnsuccesfulOperation extends RuntimeException {
	
	public UnsuccesfulOperation(String msg,Exception we)
	{
		super(msg,we);
	}

}
