package practiceexample1.bl;

import practiceexample1.daoimpl.TransactionDaoFactoryImpl;
import practiceexample1.daointf.TranssactionDaoIntf;
import practiceexample1.model.AtmTransaction;
import practiceexample1.model.Customer;
import practiceexample1.model.OnlineTransaction;
import practiceexample1.model.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public class BankAccountBL {

    TranssactionDaoIntf transintf;


    public BankAccountBL() {
        this.transintf = TransactionDaoFactoryImpl.getTransactionDaoImpl();
    }


     public int addTransactionBasedOnType(int transId, LocalDateTime timestamp,String type)
     {
         if(type.equals("atm"))
         {
             Transaction t = new AtmTransaction(transId,timestamp);

             this.transintf.addTransaction(t);
         }
         else
         {
             Transaction t = new OnlineTransaction(transId,timestamp,10);

             this.transintf.addTransaction();
         }


     }

    public double fine chargeFineForExtraTransaction()
    {

    }

    public List<Transaction> getAllTransactionsForMonthForCustomer(int month, Customer c)
    {

    }

}
