package palet;

@Fleable
public class LazyCat extends Cat {

    @Lucky(lucky = true)
    private String name = super.name;

    public LazyCat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    @Paw(count = 2)
    public void getVoice() {
        super.getVoice();
    }

    @Override
    public String getName() {
        return name;
    }
}
