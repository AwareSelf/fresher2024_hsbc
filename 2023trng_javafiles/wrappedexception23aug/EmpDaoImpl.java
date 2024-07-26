package wrappedexception23aug;



public class EmpDaoImpl implements EmpDaoIntf {

	Emp[] emparr;
	int lastIndex;
	
	public EmpDaoImpl(int size)
	{
		this.emparr = new Emp[size];
		this.lastIndex = 0;
		
	}
	
	@Override
	public boolean save(Emp e) throws EmpSaveFailed{
		
		
		
		if(this.lastIndex <  emparr.length)
		{
			this.emparr[this.lastIndex] =  e;
			this.lastIndex++;
			return true;
		}
		else
		{
		   throw new EmpSaveFailed("emp with empid:"+e.getEmpId()+" could not be saved ");	
		}
		
	}
		
	

	@Override
	public Emp retrieve(int empId) {
		
		for(Emp e: emparr)
		{
			if(e.getEmpId() == empId)
			{
				return e;
			}
		}
		return null;
	}

	@Override
	public Emp[] retrieveAll() {
		
		return this.emparr;
	}

	@Override
	public boolean delete(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Emp e) {
		
		for(Emp x:emparr)
		{
			if(x.equals(e))
			{
				return true;
			}
		}
		
		
		return false;
	}

}
