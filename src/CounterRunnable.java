import java.util.ArrayList;
import java.util.List;

public class CounterRunnable implements Runnable {

    private int count;
    private boolean isRun = true;
    private final Object LOCK = new Object();


    @Override
    public void run() {
        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();

        synchronized (LOCK) {
        for (int i = 0; i < 10000; i++) {
                if (i % 2 == 0){
                    evenNumbers.add(i + ", ");
                } else {
                    oddNumbers.add(i + ", ");
                }
            }
            System.out.println("\n\nMevcut Thread : " + Thread.currentThread().getName());
            System.out.println("\n\n-- Çift Sayılar --\n");
            for (int i = 0; i < evenNumbers.size(); i++){
                System.out.print(evenNumbers.get(i));
            }
            System.out.println("\n\n-- Tek Sayılar --\n");
            for (int i = 0; i < oddNumbers.size(); i++){
                System.out.print(oddNumbers.get(i));
            }

            }

        }

    }
