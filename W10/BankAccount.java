package W10;

class Account {
    private int balance = 1000;
    private int transactionCount = 0;

    // deposit()
    public synchronized void deposit(int amt) {
        balance += amt;
        transactionCount++;

        System.out.println("Deposited: " + amt + " | Balance: " + balance + " | tsrxn: " + transactionCount);
    }

    // withdraw()
    public synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            transactionCount++;

            System.out.println("Withdrawn: " + amt + " | Balance: " + balance + " | tsrxn: " + transactionCount);
        } else {
            System.out.println("Insufficient amt");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account acc = new Account();

        Thread depositer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                acc.deposit(100);
            }
        });

        Thread withdrawer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                acc.withdraw(80);
            }
        });

        depositer.start();
        withdrawer.start();

        // try {
        // withdrawer.join();
        // depositer.join();
        // } catch (Exception e) {
        // System.out.println("wlfh");
        // }

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
