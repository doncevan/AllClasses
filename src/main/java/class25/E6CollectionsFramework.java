package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class E6CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Banana");

        HashSet<String> hashSet = new HashSet<>(fruit);
        System.out.println(hashSet);

        LinkedList<String> linkedList = new LinkedList<>(hashSet);
        System.out.println(linkedList);
    }
}
