package W10;

public class RaceConditionTest {
    // shared memory
    private static int counter = 0;

    // synchronised --> makes sure this whole function is accessible to 1 thread at
    // a time.
    public synchronized static void increment() {
        counter++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Some exception occured");
        }

        // excepted --> 20k
        System.out.println("Final value of counter: " + counter);
    }
}
