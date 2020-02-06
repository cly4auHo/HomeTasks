package minecraft;

public class MineCraft {
    public static void main(String[] args) {
        Mine mine = new Mine();
        CreatorOfMiners creator = new CreatorOfMiners(mine);

        Miner a = new Miner(mine);
        Miner b = new Miner(mine);
        Miner c = new Miner(mine);
        Miner d = new Miner(mine);
        Miner e = new Miner(mine);
    }
}
