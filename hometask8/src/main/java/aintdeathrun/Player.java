package aintdeathrun;

public class Player implements Runnable {
    private String name;
    private Chairs chairs;
    private int gameTime = 1000;

    @Override
    public void run() {
        while (chairs.getGames() > 0) {
            System.out.println(name + " want to play");

            try {
                Thread.sleep(gameTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (chairs.check() < 0) {
                chairs.nextGame();
                break;
            }
        }

        if (Thread.activeCount() > 3)
            System.out.println(name + " is lost");
        else
            System.out.println(name + " winner");
    }


    public Player(String name, Chairs chairs) {
        this.name = name;
        this.chairs = chairs;
        new Thread(this).start();
    }
}
