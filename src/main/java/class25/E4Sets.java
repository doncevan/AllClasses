package class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit = new LinkedHashSet();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("mango");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
