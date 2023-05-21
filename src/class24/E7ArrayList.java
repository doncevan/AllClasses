package class24;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("nailPolish");
        grocery.add("Lipdick");
        grocery.add("Blush");
        grocery.add("Apple");
        grocery.add("Banana");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");

        System.out.println(grocery);
        grocery.remove("Banana");
        grocery.removeAll(fruit);
        System.out.println(grocery);
    }
}
