package transport;

public class Loader implements Runnable {

    private boolean workDone = false;
    private int count = 20;
    private int cycleTime = 1000; //1sec
    private Source source;
    private Cart cart;

    @Override
    public void run() {
        synchronized (this.cart) {
            while (!cart.isFull()) {
                try {
                    Thread.sleep(cycleTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Loader is work");
                cart.setResources(source.getSource(count));
            }

            workDone();
        }
    }

    private void workDone() {
        workDone = true;
        System.out.println("Loader has completed work");
    }

    public boolean isWorkDone() {
        return workDone;
    }

    public Loader(Source source, Cart cart) {
        this.source = source;
        this.cart = cart;
        new Thread(this).start();
    }
}
