package class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {
        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}
