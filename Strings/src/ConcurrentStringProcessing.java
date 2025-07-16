import java.util.concurrent.CompletableFuture;

public class ConcurrentStringProcessing {
    public static void main(String[] args) {
        CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 1: " + reverse("hello"));
        });

        CompletableFuture<Void> task2 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 2: " + toUpperCase("world"));
        });

        CompletableFuture<Void> combined = CompletableFuture.allOf(task1, task2);
        combined.join();
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String toUpperCase(String s) {
        return s.toUpperCase();
    }
}
