package paket;
@AnooTest
public class Refector {



    public String name = "Name";
    private String bread = "Kitty";

    @AnooTest
    public void methodPublic() {
        System.out.println("Public method");
    }

    private String methodPrivate(String name, int age) {
        System.out.println(name + age);
        System.out.println("Private method");
        return "private String method";
    }

    public String methodString() {
        System.out.println("String method");
        return "public string method";
    }

    @Override
    public String toString() {
        return "Refector{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }

    public Refector(String name) {
        this.name = name;
    }

    public Refector() {
    }
}
