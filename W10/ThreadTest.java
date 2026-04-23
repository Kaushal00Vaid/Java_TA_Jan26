package W10;

import java.lang.*;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Worker: step " + i);

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Some exception occured");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Worker: step " + i);

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Some exception occured");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // i will sure, t1 completes the execution
            t2.join();
        } catch (Exception e) {
            System.out.println("Some exception occured");
        }

        // I am not waiting for the thread to complete
        System.out.println("Main Thread: Hi from main");
        System.out.println("Main 2 Thread: hi back");
    }
}