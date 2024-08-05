package userdefinedexeceptionex;

import multithreadingsynchro.InsufficientBalanceException;

public class Account {

    private int acctId;
    private String acctName;
    private double acctBal;

    public Account(int acctId, String acctName, double acctBal) {
        this.acctId = acctId;
        this.acctName = acctName;
        this.acctBal = acctBal;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public double getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(double acctBal) {
        this.acctBal = acctBal;
    }

    public double withdraw(double amt) throws InsufficientBalanceException
    {
        if(this.acctBal >= amt)
        {
            this.acctBal = this.acctBal - amt;
        }
        else
        {
            throw new InsufficientBalanceException(this.acctBal,amt,this.acctId);
        }
        return this.acctBal;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acctId=" + acctId +
                ", acctName='" + acctName + '\'' +
                ", acctBal=" + acctBal +
                '}';
    }
}
