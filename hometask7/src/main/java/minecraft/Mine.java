package minecraft;

public class Mine {

    private volatile int gold = 1000;
    private volatile boolean live = true;

    public void getGold() {
        try {
            Thread.sleep(1000); //1sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (gold > 0) {
            gold -= 10;
            System.out.println("Mine lost gold");
        } else {
            live = false;
            System.out.println("Mine is empty");
        }
    }

    public synchronized boolean isLive() {
        return live;
    }
}
