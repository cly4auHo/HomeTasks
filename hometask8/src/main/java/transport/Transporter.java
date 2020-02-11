package transport;

public class Transporter implements Runnable {

    private boolean workDone = false;
    private int timeToWork = 3000;
    private Loader loader;
    private Cart cart;

    @Override
    public void run() {
        while (cart != null) {
            synchronized (this.cart) {
                if (loader.isWorkDone() && cart.isFull()) {
                    System.out.println("Transporter take a cart and go to Unloader");

                    try {
                        Thread.sleep(timeToWork);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    workDone = true;
                    System.out.println("Transporter give a cart to Unloader");
                    cart.setOnPlace(true);
                } else if (cart.isEmpty() && cart.isOnPlace()) {
                    System.out.println("Transporter get empty cart and go back");

                    try {
                        Thread.sleep(timeToWork);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Transporter return a cart");
                    cart.setOnPlace(false);
                    break;
                }
            }
        }
    }

    public boolean isWorkDone() {
        return workDone;
    }

    public Transporter(Loader loader, Cart cart) {
        this.loader = loader;
        this.cart = cart;
        new Thread(this).start();
    }
}
