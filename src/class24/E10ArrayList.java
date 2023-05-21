package class24;

import java.util.ArrayList;

public class E10ArrayList {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("coke");
        str.add("run");
        str.add("city");
        str.add("trade");
        str.add("brake");
        str.add("tree");
        str.add("roof");
        System.out.println(str);

        str.removeIf(a -> a.endsWith("e"));//     <--    !!this is the way to go!!   "a" can be anything

       /* Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();     <------ !! this worked on Java 8 !!
            if (word.endsWith("e")) {
                iterator.remove();
            }
        } */
        System.out.println(str);


    }
}