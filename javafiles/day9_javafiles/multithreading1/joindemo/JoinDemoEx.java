package multithreading1.joindemo;

public class JoinDemoEx {

    public static void main(String[] args) {

        Runnable r = new MyThreadRunnable();
        Thread t1 = new Thread(r,"t1");

        t1.start();

        for(int i=1;i<100;i++)
        {

            System.out.println(Thread.currentThread().getName()+":"+i);

            if(i==3)
            {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
