package W10;

class MyThreadRunnable implements Runnable {
    private String name;

    MyThreadRunnable(String name) {
        this.name = name;
    }

    // override run() method
    // public void run() {}

    // overridden function
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " --> step " + i +
                    " [thread: " + Thread.currentThread().getName() + "]");
        }

        // stuck task
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("Some exception occured");
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        // when you create threads with Runnable

        Thread t1 = new Thread(new MyThreadRunnable("Kaushal"));
        Thread t2 = new Thread(new MyThreadRunnable("Dhruv"));

        t1.start();
        t2.start();
    }
}
