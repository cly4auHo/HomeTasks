package aintdeathrun;

public class GonkiMain {

    public static void main(String[] args) {
        Chairs chairs = new Chairs();
        Player a = new Player("A", chairs);
        Player b = new Player("B", chairs);
        Player c = new Player("C", chairs);
        Player d = new Player("D", chairs);
        Player e = new Player("E", chairs);
    }
}