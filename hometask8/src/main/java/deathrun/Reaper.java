package deathrun;

public class Reaper {

    private volatile int count = 4;

    public synchronized void deathRun(String name) {
        if (count > 0) {
            count--;
            System.out.println(name + " is alive");
        } else {
            System.out.println(name + " is dead");
        }
    }
}
