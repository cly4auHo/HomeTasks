package transport;

public class Unloader implements Runnable {

    private int count = 20;
    private int resources = 0;
    private int timeToWork = 3000;
    private Transporter transporter;
    private Cart cart;

    @Override
    public void run() {
        synchronized (this.cart) {
            while (cart.isOnPlace()) {
                if (resources == 0) {
                    System.out.println("Unloader start working");
                    try {
                        Thread.sleep(timeToWork);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (transporter.isWorkDone() && cart.isFull()) {
                    resources += cart.getResources(count);

                    if (cart.isEmpty()) {
                        System.out.println("Unloader take a " + resources);
                        break;
                    }
                }
            }
        }
    }

    public Unloader(Transporter transporter, Cart cart) {
        this.transporter = transporter;
        this.cart = cart;
        new Thread(this).start();
    }
}
