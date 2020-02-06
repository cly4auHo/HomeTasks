package shop;

public class ShopMain {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        Customer a = new Customer(cashier, "A");
        Customer b = new Customer(cashier, "B");
        Customer c = new Customer(cashier, "C");
        Customer d = new Customer(cashier, "D");
        Customer e = new Customer(cashier, "E");
    }
}
