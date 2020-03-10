package aintdeathrun;

public class Player implements Runnable {
    private String name;
    private Chairs chairs;
  
    @Override
     public void run() {
        synchronized (this.chairs) {
            while (chairs.getGames() > 0) {
                System.out.println(name + " want to play");
        
                if (chairs.check() >= 0)
                    chairs.waitNextGame();
                else {
                    chairs.nextGame();
                    break;
                }
            }

            if (Thread.activeCount() > 3)
                System.out.println(name + " is lost");
            else
                System.out.println(name + " winner");
        }
    }


    public Player(String name, Chairs chairs) {
        this.name = name;
        this.chairs = chairs;
        new Thread(this).start();
    }
}
