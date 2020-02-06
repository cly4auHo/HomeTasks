package minecraft;

public class Miner implements Runnable {

    Mine mine;

    public void run() {
        while (mine.isLive()) {
            mine.getGold();
        }
    }

    public Miner(Mine mine) {
        this.mine = mine;
        new Thread(this).start();
    }
}
