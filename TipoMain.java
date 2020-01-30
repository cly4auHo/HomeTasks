package hometaskpudge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddLetter {

    public static void main(String[] args) {
        List<String> stringi = new ArrayList<>();

        String a = "gg";
        String a2 = "hf";
        String a3 = "wp";
        String a4 = "gl";
        String a5 = "g";

        stringi.add(a);
        stringi.add(a2);
        stringi.add(a3);
        stringi.add(a4);
        stringi.add(a5);

        stringi=  stringi.stream().map(x -> x.concat("a")).collect(Collectors.toList());
                      
        stringi.forEach((s) -> {
            System.out.println(s);
        });
    }
}
