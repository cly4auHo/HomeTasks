package aintdeathrun;

import java.util.concurrent.atomic.AtomicInteger;

public class Chairs {
    AtomicInteger aInt = new AtomicInteger(4);
    private int games = 4;

    public synchronized int check() {
        return aInt.decrementAndGet();
    }

    public int getGames() {
        return games;
    }

    public void waitNextGame() {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.interrupted();
        }
    }

    public void nextGame() {
        //and sleep until music play
        aInt.set(--games);
        notifyAll();       
    }

    public Chairs() {
        System.out.println("Go");
    }
}
