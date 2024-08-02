package multithreading1.synchronization;

public class SynchronizationEx {
    public static void main(String[] args) {

       Account ob = new Account(1,"Namrata",5000);

       Runnable r = new User1(ob);
       Thread u1 = new Thread(r);

              r = new User2(ob);
       Thread u2 = new Thread(r);

       u1.start();
       u2.start();



    }
}
