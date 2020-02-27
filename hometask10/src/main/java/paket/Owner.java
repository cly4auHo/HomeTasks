package paket;

import java.io.Serializable;

public class Owner implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
    }
}