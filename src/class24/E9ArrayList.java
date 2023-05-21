package class24;

import java.util.ArrayList;

public class E9ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("coke");
        words.add("run");
        words.add("city");
        words.add("trade");
        words.add("brake");
        words.add("tree");
        words.add("roof");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            if (s.endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}