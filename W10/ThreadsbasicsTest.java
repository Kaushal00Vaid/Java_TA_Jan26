package W10;

import java.lang.*;

class MyThread extends Thread {
    String name;
    int id;

    MyThread(String name) {
        this.name = name;
    }

    MyThread(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(id + " --> step " + i +
                    "[thread: " + Thread.currentThread().getName() + "]");
        }
    }
    // override run() function/method
}

public class ThreadsbasicsTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(101);
        MyThread t2 = new MyThread(102);
        MyThread t3 = new MyThread(101);
        MyThread t4 = new MyThread(102);
        MyThread t5 = new MyThread(101);

        // t1.run(); // run it sequentially

        t1.start(); // start --> run run() in parallel
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("This comes from main thread");
    }
}