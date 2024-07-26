package wrappedexception23aug;

public class StorageFactory {
	
	//factory pattern
	public static  EmpDaoIntf getStorage(int no,int size)
	{
		EmpDaoImpl impl1=null;
		if(no==1)
		{
		   impl1 = new EmpDaoImpl(size);
		  return impl1;
		}
		else if(no==2)
		{
			EmpDaoImplCollection impl2 = new EmpDaoImplCollection();
			return impl2;
		}
		
		return impl1;
	}

}
