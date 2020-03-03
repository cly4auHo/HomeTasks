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
        notifyAll();
        aInt.set(--games);
    }

    public Chairs() {
        System.out.println("Go");
    }
}
