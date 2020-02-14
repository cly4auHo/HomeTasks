package palet;

public class Cat {

    protected String name;
    protected int age;
    protected String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Paw
    public void getVoice(){
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }
}
