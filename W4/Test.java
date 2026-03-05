package W4;

abstract class Payment {
    double amount;
    static final int MAX = 10;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void process();

    void print() {
        System.out.println("Amount paid" + amount);
    }
}


class CreditCard extends Payment {
    
    CreditCard(double amt) {
        super(amt);
    }

    void process() {
        System.out.println("Processing Payment through a Credit Card");
    }
}

class UPI extends Payment {
    UPI(double amt) {
        super(amt);
    }

    void process() {
        System.out.println("Processing Payment through UPI");
    }
}

public class Test {
    public static void main(String[] args) {
        Payment p1 = new CreditCard(5000);
        Payment p2 = new UPI(4000);

        p1.process(); // Through Credit CArd
        p1.print(); // print

        p2.process(); // UPI
        p2.print(); // print
    }
}