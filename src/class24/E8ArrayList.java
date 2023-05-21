package class24;

import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ben");
        names.add("Karl");
        names.add("Mary");
        names.add("Ann");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ben"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
