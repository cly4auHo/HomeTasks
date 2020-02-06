package minecraft;

public class CreatorOfMiners implements Runnable {

    private Mine mine;

    public void run() {
        while (true) {
            if (mine.isLive()) {
                new Miner(mine);
            } else {
                break;
            }
        }
    }

    public CreatorOfMiners(Mine mine) {
        this.mine = mine;
        new Thread(this).start();
    }
}
