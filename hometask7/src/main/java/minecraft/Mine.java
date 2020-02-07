package minecraft;

public class Mine extends Thread {

    private volatile int gold = 1000;
    private volatile boolean live = true;

    public synchronized int getGold(int gettingGold) {

        if (gold > gettingGold) {
            System.out.println("Mine lost gold");
            gold -= gettingGold;
            System.out.println("Now is " + gold + " gold");
            return gettingGold;
        } else if (gold > 0 && gold < gettingGold) {
            System.out.println("Mine lost last gold");
            live = false;
            setDaemon(false);
            int temp = gold;
            gold = 0;
            return temp;
        } else if (gold == 0) {
            System.out.println("Mine is empty");
            live = false;
            setDaemon(false);
            return 0;
        }

        return 0;
    }

    public boolean isLive() {
        return live;
    }

    public Mine() {
        setDaemon(true);
        start();
    }
}
