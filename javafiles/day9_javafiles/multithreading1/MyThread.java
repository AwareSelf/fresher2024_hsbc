package multithreading1;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run()
    {
        for(int j=100;j>=1;j--)
        {
            System.out.println(Thread.currentThread().getName()+" priority:"+Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName()+"j="+j);
         /*   try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}

