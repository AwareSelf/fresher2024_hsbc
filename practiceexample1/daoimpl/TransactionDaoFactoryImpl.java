package practiceexample1.daoimpl;

import practiceexample1.daointf.TranssactionDaoIntf;

public class TransactionDaoFactoryImpl {


    public static TranssactionDaoIntf getTransactionDaoImpl()
    {

        return new TransactionDaoImpl();
    }
}
