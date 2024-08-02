package multithreading1.synchronization;

import multithreadingsynchro.InsufficientBalanceException;

public class User1 implements  Runnable{
    Account ob;

    public User1(Account ob)
    {
        this.ob = ob;
    }

    @Override
    public void run() {
        try {
            this.ob.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }
}
