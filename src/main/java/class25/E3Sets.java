package class25;

import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        HashSet<String> uniqNames = new HashSet<>();
        uniqNames.add("Green");
        uniqNames.add("Brown");
        uniqNames.add("Blue");

        uniqNames.add("Black");
        System.out.println(uniqNames);
        for (String name : uniqNames) {
            System.out.println(name);
        }
    }
}
