package layered.dao;

import layered.daointf.DaoIntf;

public class DaoFactory {
	
	
	public static DaoIntf getDaoImpl()
	{
		
		return new DaoImpJdbc();
	}

}
