package miscellaneous.virtualthreads;



    import java.util.concurrent.CompletableFuture;
    import java.util.concurrent.ExecutionException;

public class CompletableFutureWithVirtualThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future =
                CompletableFuture.supplyAsync(() -> {
                    int sum = 0;
                    for (int i = 1; i < 100; i++) {
                        sum += i;
                    }
                    return sum;
                })
                .thenAcceptAsync(result -> {
                    System.out.println("addn of 1 to 100 is: " + result +
                            " in thread: " + Thread.currentThread().getName());
                });


        future.join();


    }
}

