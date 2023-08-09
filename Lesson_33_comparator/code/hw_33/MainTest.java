package hw_33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        String name1 = "Masha";
        String name2 = "Ira";
        String name3 = "Dasha";

        List<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);

        Collections.sort(names);
        System.out.println(names);
    }
}
