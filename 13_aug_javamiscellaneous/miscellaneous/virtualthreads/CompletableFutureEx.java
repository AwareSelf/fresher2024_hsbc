package miscellaneous.virtualthreads;
import java.util.concurrent.CompletableFuture;

//Callbacks of Completable Future use virtual threads
public class CompletableFutureEx {
    public static void main(String[] args) {
      CompletableFuture<Integer> future =
                java.util.concurrent.CompletableFuture.supplyAsync(() -> {
        //    int result = 10 / 0; // Causes an ArithmeticException
            int result = 10/ 2;
            return result;
        });

        future.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value to return if there's an exception
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });
    }
}
