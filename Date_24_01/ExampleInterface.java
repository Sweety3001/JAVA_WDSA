
interface Payment {

    void pay(int amount);
}

interface Balance {
    // void pay(int amount);

    int getBalance();

    default void pay() {
        System.out.println("This is a default method in Balance interface");
    }
}

class Upi implements Payment, Balance {

    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
        pay();
    }

    public int getBalance() {
        return 10000;
    }
}

public class ExampleInterface {

    public static void main(String[] args) {
        Upi u = new Upi();
        u.pay(5000);
        int bal = u.getBalance();
        System.out.println("Current Balance: " + bal);
    }
}
