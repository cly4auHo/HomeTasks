package minecraft;

public class CreatorOfMiners extends Thread {

    private Mine mine;
    private int timeToSleep = 10000;

    @Override
    public void run() {
        new Thread(new Miner("A", mine)).start();
        new Thread(new Miner("B", mine)).start();
        new Thread(new Miner("C", mine)).start();

        while (true) {
            try {
                sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (mine.isLive()) {
                new Thread(new Miner("Intern", mine)).start();
            } else {
                break;
            }
        }
    }

    public CreatorOfMiners(Mine mine) {
        this.mine = mine;
        start();
    }
}
