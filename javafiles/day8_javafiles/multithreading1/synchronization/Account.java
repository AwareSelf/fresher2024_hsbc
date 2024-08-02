package multithreading1.synchronization;

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

    public  double withdraw(double amt) throws InsufficientBalanceException
    {
        System.out.println(Thread.currentThread().getName()+" inside withdraw..");

        //if u remove this synchronized block u will see that account balance is overdrawn
        // and bal=-1000
        synchronized(this)
        {
            if (this.acctBal >= amt) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.acctBal = this.acctBal - amt;

                System.out.println("bal=" + this.acctBal);
            } else {
                throw new InsufficientBalanceException(this.acctBal, amt, this.acctId);
            }
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
