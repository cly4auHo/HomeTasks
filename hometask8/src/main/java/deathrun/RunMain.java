package deathrun;

public class RunMain {
    public static void main(String[] args) {
        Reaper reaper = new Reaper();

        IWantLive a = new IWantLive("A", reaper);
        IWantLive b = new IWantLive("B", reaper);
        IWantLive c = new IWantLive("C", reaper);
        IWantLive d = new IWantLive("D", reaper);
        IWantLive e = new IWantLive("E", reaper);
    }
}
