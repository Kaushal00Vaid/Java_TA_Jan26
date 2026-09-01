package W11;

import java.util.concurrent.locks.*;

public class ReentrantLockTest {
    static class Bank {
        private final Lock bankLock = new ReentrantLock();
        private final double[] accounts = new double[10];

        Bank() {
            for (int i = 0; i < accounts.length; i++) {
                accounts[i] = 1000.0;
            }
        }

        // transfer money --> from one acc to other
        public void transfer(int from, int to, double amt) {
            // critical section
            // acquire the lock
            bankLock.lock();

            try {
                if (accounts[from] < amt) {
                    System.out.println("Insufficiet Amount");
                    return;
                }
                accounts[from] -= amt;
                accounts[to] += amt;

                System.out.println("Transferred " + amt + "from " + from + " to " + to);
            } finally {
                bankLock.unlock();
            }
        }

        public double getBalance(int idx) {
            return accounts[idx];
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                bank.transfer(1, 0, 5.0);
            }
        };

        Thread t1 = new Thread(task); // 500 from 1 to 0
        Thread t2 = new Thread(task); // 500 from 1 to 0

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Account 1 balance: " + bank.getBalance(1)); // 1000 - 1000 = 0
        System.out.println("Account 0 balance: " + bank.getBalance(0)); // 1000 + 1000 = 2000

    }
}
