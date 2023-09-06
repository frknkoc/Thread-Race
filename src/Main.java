import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CounterRunnable c = new CounterRunnable();
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.execute(c);
    }
}