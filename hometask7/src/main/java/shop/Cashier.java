package shop;

import java.util.Random;

public class Cashier extends Thread {

    private volatile boolean free = true;
    private int chanceToClose = 30;

    public synchronized void enterToShop() {
        if (free)
            buy();
    }

    private synchronized void buy() {
        System.out.println("Customer is buy");
        int chance = new Random().nextInt(101);

        if (chance >= chanceToClose) {
            free = true;
            System.out.println("Next Customer");
        } else {
            free = false;
            setDaemon(false);
            System.out.println("Shop is closed");
        }
    }

    public Cashier() {
        setDaemon(true);
        start();
    }
}
