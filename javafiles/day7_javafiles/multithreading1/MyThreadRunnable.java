package multithreading1;

public class MyThreadRunnable implements  Runnable {
    @Override
    public void run() {

        for(int k=1000;k<=1100;k++)
        {
            System.out.println(Thread.currentThread().getName()+"k="+k);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
