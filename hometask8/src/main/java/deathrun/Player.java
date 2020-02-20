package deathrun;

public class Player implements Runnable {
    private String name;
    private Chairs phaser;
    private int gameTime = 1000;

    @Override
    public void run() {
        while (phaser.getGames() > 0) {
            System.out.println(name + " want to play");

            try {
                Thread.sleep(gameTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (phaser.check() >= 0) {
                phaser.waitNextStep();
            } else {
                phaser.leaveGame();
                break;
            }
        }

        if (phaser.getGames() >= 0)
            System.out.println(name + " is lost");
        else
            System.out.println(name + " winner");
    }


    public Player(String name, Chairs phaser) {
        this.name = name;
        this.phaser = phaser;
        phaser.iWantPlay();
        new Thread(this).start();
    }
}
