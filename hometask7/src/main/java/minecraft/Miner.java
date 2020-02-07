package minecraft;

public class Miner extends Thread {

    private Mine mine;
    private String name;
    private int timeToSleep = 3000;
    private int countOfGold = 0;
    private int takeGold = 30;

    @Override
    public void run() {
        while (mine.isLive()) {
            countOfGold += mine.getGold(takeGold);

            try {
                sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " get " + countOfGold + " gold");
    }

    public Miner(String name, Mine mine) {
        this.name = name;
        this.mine = mine;
    }
}
