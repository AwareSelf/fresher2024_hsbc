package multithreading1.joindemo;

public class MyThreadRunnable implements  Runnable {
    @Override
    public void run() {

        for(int k=1;k<25;k++)
        {
            System.out.println(Thread.currentThread().getName()+" priority:"+Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName()+"k="+k);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
