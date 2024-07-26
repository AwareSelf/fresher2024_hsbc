package wrappedexception23aug;



public interface EmpDaoIntf {
	
	boolean save(Emp e) throws EmpSaveFailed;
	Emp retrieve(int empId);
	Emp[] retrieveAll();
	boolean delete(int empId);
	boolean contains(Emp e);
	
	

}
