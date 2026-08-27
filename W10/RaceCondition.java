package W10;

public class RaceCondition {
    // shared among objects
    static int counter = 0;

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
            System.out.println("wsfh");
        }

        System.out.println("Final counter: " + counter);
    }
}
