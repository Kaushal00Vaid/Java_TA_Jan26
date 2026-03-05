package W4;

interface PaymentGateway {
    void pay(double amt);

    default void display() {
        System.out.println("Payment Gateway class");
    }

    // default void display() {
    //     System.out.println("I am in PaymentGateway class");
    // }
}

class RazorPay implements PaymentGateway {
    public void pay(double amt) {
        System.out.println("Paying " + amt + " using RazorPay");
    }

    public void display() {
        System.out.println("I am in Razorpay class");
    }
}

class Paytm implements PaymentGateway {
    public void pay(double amt) {
        System.out.println("Paying " + amt + " using PayTM");
    }

    // public void display() {
    //     System.out.println("I am in PayTM class");
    // }
}

public class Interface {
    public static void main(String[] args) {
        PaymentGateway p1 = new RazorPay();
        PaymentGateway p2 = new Paytm();

        p1.pay(5000); // Paying 5k using RazorPay
        p2.pay(4000);

        p1.display(); // Iam in RP class
        p2.display(); // I am in Paytm class
    }
}