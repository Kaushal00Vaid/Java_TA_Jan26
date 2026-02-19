class BankAccount {
    // instance variables
    private String accHolder;
    private double balance;
    private String[] nominees;

    BankAccount(String acc, double b, String[] n) {
        accHolder = acc;
        balance = b;
        nominees = n;
    }

    // copy constructors
    BankAccount(BankAccount b) {
        accHolder = b.accHolder;
        balance = b.balance;

        // nominees = b.nominees; // shallow copy

        nominees = new String[b.nominees.length];

        int idx = 0;
        for(String i : b.nominees) {
            nominees[idx] = i;
            idx++;
        }
    }

    // getters and setters
    // String accHolder
    public void setAccHolder(String acc) {
        accHolder = acc;
    }
    public String getAccHolder() {
        return accHolder;
    }

    // balance
    public void setBalance(double b) {
        balance = b;
    }
    public double getBalance() {
        return balance;
    }

    // nominee
    public void setNominee(String nom, int idx) {
        nominees[idx] = nom;
    }

    public void setNomiee(String[] nom) {
        nominees = nom;
    }

    public String[] getNominee() {
        return nominees;
    }

    // deposit
    void deposit(double money) {
        balance += money;
    }

    // withdrawal
    double withdraw(double money) {
        if(balance < money) {
            System.out.println("Insufficient amount");
            return -1.0; // placeholder value
        }

        balance -= money;
        System.out.println("Updated balance: " + balance);
        return money;
    }
}


public class PracGettersAndSetters {

    static void printDetails(BankAccount b) {
        System.out.println("Account Holder: " + b.getAccHolder());
        System.out.println("Account balance: " + b.getBalance());
        System.out.println("Nominee are :");

        for(String i : b.getNominee()) {
            System.out.println(i);
        }
    }

    


    public static void main(String[] args) {

        String[] nom = new String[]{"Mother", "Father", "Sister"};

        BankAccount b1 = new BankAccount("Kaushal", 60000.0, nom);

        BankAccount b2 = new BankAccount(b1);

        // change the details --> INITIAL SETUP
        b2.setAccHolder("Sonu");
        b2.setBalance(40000);
        b2.setNominee("Brother", 2);

        System.out.println("Account 1");

        printDetails(b1);

        System.out.println("Account 2");
        printDetails(b2);


        // TEST DEPOSIT and WITHDRAWAL
        double returnedAmount = b1.withdraw(20000);
        if(returnedAmount == -1.0) {
            System.out.println("Sorry i cant ");
        } else {
            System.out.println();
        }
        System.out.println("After first withdraw");
        printDetails(b1);

        b1.withdraw(50000);

        printDetails(b1);

        b1.deposit(20000);

        System.out.println("After deposit");
        printDetails(b1);

    }
}
