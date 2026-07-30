package OPPE;

import java.util.*;

interface Transferable {
    public abstract String transfer();
}

class PaymentApp {
    String accno;

    public PaymentApp(String n) {
        accno = n;
    }

    private class Account implements Transferable {
        double amount;
        double balance;

        public Account(double a) {
            amount = a;
            balance = 1000;
        }

        public String transfer() {
            if (balance < amount)
                return "Failed transaction";
            else {
                balance = balance - amount;
                return "Money debited current balance is " + balance;
            }
        }
    }

    // DEFINE method payRequest()
    public Transferable payRequest(double amt) {
        // Account acc = new Account(amt);
        // return acc;

        return new Account(amt);
    }
}

public class TestQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentApp u1 = new PaymentApp("ACC101010");
        Transferable t1 = u1.payRequest(sc.nextDouble());
        System.out.println(t1.transfer());
    }
}
