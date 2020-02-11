package deathrun;

public class IWantLive implements Runnable {

    private Reaper reaper;
    private String name;

    public void run() {
        reaper.deathRun(name);
    }

    public IWantLive(String name, Reaper reaper) {
        this.name = name;
        this.reaper = reaper;
        new Thread(this).start();
    }
}
