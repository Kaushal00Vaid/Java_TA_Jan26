package W10;

class BankAccount {
    // shared memory
    private int balance = 1000;
    private int transactionCount = 0;

    // deposit()
    public synchronized void deposit(int amount) {
        balance += amount;
        transactionCount++;

        System.out.println("Deposited " + amount + " | Balance " + balance + " | txsn " + transactionCount);
    }

    // withdraw()
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionCount++;

            System.out.println("Withdraw " + amount + " | Balance " + balance + " | txsn " + transactionCount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // getter for balance
    public int getBalance() {
        return balance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Thread depositor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                acc.deposit(100);
            }
        });
        // balance --> 1500

        Thread withdrawer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                acc.withdraw(80);
            }
        });

        // balance --> 1100

        depositor.start();
        withdrawer.start();

        try {
            depositor.join();
            withdrawer.join();
        } catch (Exception e) {
            System.out.println("Some exception occured");
        }

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
