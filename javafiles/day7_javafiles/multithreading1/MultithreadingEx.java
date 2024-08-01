package multithreading1;

public class MultithreadingEx {

    public static void main(String[] args) {


        Thread t1 = new MyThread("Thread-1");
        t1.start();

        Runnable ob = new MyThreadRunnable();
        Thread t2 = new Thread(ob,"Thread-2");
        t2.start();



        for(int i=1;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"i="+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
