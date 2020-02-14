package palet;

public class FarshMain {
    public static void main(String[] args) {
        LazyCat lazyCat = new LazyCat("Garfield", 41, "Red");
        SuperCat superCat = new SuperCat("William", 56, "Black");
        FatCat fatCat = new FatCat("Jorik",7,"White & Brown & Orange");

        CatFarchFactory factory = new CatFarchFactory();

         factory.catEater(lazyCat);
         factory.catEater(superCat);
         factory.catEater(fatCat);
    }
}
