package W10;

import java.lang.*;

class MyThread extends Thread {
    private int id;

    MyThread(int id) {
        this.id = id;
    }

    // override run() method
    // public void run() {}

    // overridden function
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(id + " --> step " + i +
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

public class ThreadBasicsTest {
    public static void main(String[] args) {
        // MyThread t1 = new MyThread(101);
        // MyThread t2 = new MyThread(102);
        // MyThread t3 = new MyThread(103);
        // MyThread t4 = new MyThread(104);
        // MyThread t5 = new MyThread(105);

        // // t1.run(); // --> run this thread sequentially

        // t1.start(); // says --> run the Thread parallely
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();

        // loop
        MyThread[] p = new MyThread[5];

        for (int i = 0; i < 4; i++) {
            p[i] = new MyThread(i);
            p[i].start();
        }

    }
}