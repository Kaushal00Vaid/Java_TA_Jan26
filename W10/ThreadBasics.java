package W10;

public class ThreadBasics {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Worker step: " + i + "[Thread: " + Thread.currentThread().getName() + "]");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Worker step: " + i + "[Thread: " + Thread.currentThread().getName() + "]");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("wsfh");
        }

        System.out.println("This comes from main -- 1");
        System.out.println("This comes from main -- 2");

        try {
            t2.join();
        } catch (Exception e) {
            System.out.println("wsfh");
        }
    }
}
