package practiceexample1.daoimpl;

import practiceexample1.daointf.TranssactionDaoIntf;
import practiceexample1.model.Transaction;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TransactionDaoImpl implements TranssactionDaoIntf {

    Set<Transaction> set;

    public TransactionDaoImpl() {
        this.set = new TreeSet<Transaction>();
    }

    @Override
    public void addTransaction(Transaction t) {

        this.set.add(t);

    }
}
