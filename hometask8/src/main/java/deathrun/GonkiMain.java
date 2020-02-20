package deathrun;

public class GonkiMain {

    public static void main(String[] args) {
        Chairs phaser = new Chairs();
        Player a = new Player("A", phaser);
        Player b = new Player("B", phaser);
        Player c = new Player("C", phaser);
        Player d = new Player("D", phaser);
        Player e = new Player("E", phaser);
    }
}
