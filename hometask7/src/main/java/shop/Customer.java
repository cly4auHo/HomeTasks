package shop;

public class Customer implements Runnable {

    private Cashier cashier;
    private String name;

    public Customer(Cashier cashier, String name) {
        this.cashier = cashier;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        cashier.enterToShop();
    }
}