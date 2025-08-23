package Day3;

abstract class Payments {
    double amount;

    Payments(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    void showSuccessMessage() {
        System.out.println("Payment successful " + amount);
    }
}

class CreditCardPayment extends Payments {
    CreditCardPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Credit Card payment is Done...");
    }
}

class UpiPayment extends Payments {
    UpiPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Upi payment is Done...");
    }
}

public class Payment {
    public static void main(String[] args) {
        Payments py = new CreditCardPayment(45000.0); // use .0 to ensure double
        py.makePayment();
        py.showSuccessMessage();

        Payments py2 = new UpiPayment(30000.0); // use .0 to ensure double
        py2.makePayment();
        py2.showSuccessMessage();
    }
}

