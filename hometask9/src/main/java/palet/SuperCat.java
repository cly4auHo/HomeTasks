package palet;

public class SuperCat extends Cat {

    @Lucky(lucky = true)
    private String name = super.name;

    public SuperCat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    @Paw(count = 4)
    public void getVoice() {
        super.getVoice();
    }

    @Override
    public String getName() {
        return name;
    }
}
