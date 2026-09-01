package W11;

public class LifecycleTest {

    // shared is my shared variable
    private static final Object sharedLock = new Object();

    static void doWork(String name) {
        synchronized (sharedLock) {
            // the thread acquired the lock
            System.out.println(name + "acquired the lock");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }

            // release the lock
            System.out.println(name + "releasing the lock");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Before start(): " + t.getState()); // NEW

        t.start();

        System.out.println("Right after start(): " + t.getState()); // RUNNABLE
        try {

            Thread.sleep(200);

            System.out.println("While it sleeps: " + t.getState()); // TIMED WAITING

            t.join(); // thread is ran fully

            System.out.println("After join(): " + t.getState()); // TERMINATED
        } catch (Exception e) {
            System.out.println("Some exception");
        }

        // -------------
        System.out.println();
        System.out.println("============");

        Thread t1 = new Thread(() -> {
            doWork("Thread-1");
        });

        Thread t2 = new Thread(() -> {
            doWork("Thread-2");
        });

        t1.start();
        try {
            Thread.sleep(200); // let t1 to take the lock
            t2.start();

            Thread.sleep(300); // t2 is in that BLOCKED STATE

            System.out.println("Thread-1 state: " + t1.getState()); //
            System.out.println("Thread-2 state: " + t2.getState());

            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Some exception occured");
        }

    }
}