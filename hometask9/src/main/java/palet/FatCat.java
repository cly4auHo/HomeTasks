package palet;

public class FatCat extends Cat{

    @Lucky
    private String name = super.name;

    public FatCat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    @Paw(count = 0)
    public void getVoice() {
        super.getVoice();
    }

    @Override
    public String getName() {
        return name;
    }
}
