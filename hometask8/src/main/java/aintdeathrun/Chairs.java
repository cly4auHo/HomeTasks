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

    public void nextGame() {
        aInt.set(--games);
    }

    public Chairs() {
        System.out.println("Go");
    }
}
