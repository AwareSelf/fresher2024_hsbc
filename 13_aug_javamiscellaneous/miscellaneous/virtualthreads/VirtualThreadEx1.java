package miscellaneous.virtualthreads;

/*
Virtual Threads in Java

In Java, Virtual threads are now supported by the Java Platform.
Virtual threads are lightweight threads that greatly minimize the effort required to
create, operate, and manage high volumes systems that are concurrent.
As a result, they are more efficient and scalable than standard platform threads.

A thread is the smallest processing unit that can be scheduled.
It operates concurrently with, and mostly independently of other units of this type.
It’s an instance of java.lang.Thread.

There are two kinds of threads, platform threads and virtual threads:
Platform Threads
Virtual Threads
 */
public class VirtualThreadEx1 {

    public static void main(String[] args) {

        Runnable r = () -> {
            for(int i=1;i<50;i++) {
                System.out.println("Running task in a virtual thread: "
                        + Thread.currentThread().getName());
                System.out.println("virtual thread id:"+Thread.currentThread().threadId());
                try {
                    if(i>=10)
                    {
                        Thread.sleep(5000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread.Builder tb = Thread.ofVirtual().name("MyThread");
        Thread virtualThread = tb.start(r);
        System.out.println(virtualThread.isVirtual());

        // Waiting for virtual threads to complete
        try {
            virtualThread.join();
            System.out.println("main continues after virtual thread is completed..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
