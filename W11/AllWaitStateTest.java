package W11;

public class AllWaitStateTest {
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        // Thread A --> wait()
        Thread waitingThread = new Thread(() -> {
            synchronized (monitor) {
                try {
                    monitor.wait();

                    System.out.println("Lock is released");
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread sleepingThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread blockedThread = new Thread(() -> {
            synchronized (monitor) {
                System.out.println("blockedThread finally got in");
            }
        });

        waitingThread.start();
        sleepingThread.start();

        try {
            Thread.sleep(200); // waitingThread actuallyt react wait()

            Thread lockHolder = new Thread(() -> {
                synchronized (monitor) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Some exception occured");
                    }
                }
            });

            lockHolder.start();
            Thread.sleep(100);
            blockedThread.start();
            Thread.sleep(200);

            System.out.println("waitingThread state: " + waitingThread.getState()); // WAITING
            System.out.println("sleepingThread state: " + sleepingThread.getState()); // TIMED_WAITING
            System.out.println("blockedState state: " + blockedThread.getState()); // BLOCKED

            synchronized (monitor) {
                monitor.notifyAll();
            }

            waitingThread.join();
            sleepingThread.join();
            lockHolder.join();
            blockedThread.join();

        } catch (Exception e) {
            System.out.println("wsfiuguib");
        }
    }
}
