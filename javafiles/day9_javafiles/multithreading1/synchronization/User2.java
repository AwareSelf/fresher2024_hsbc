package multithreading1.synchronization;

import multithreadingsynchro.InsufficientBalanceException;

public class User2 implements  Runnable{
    Account ob;

    public User2(Account ob)
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
