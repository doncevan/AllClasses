package class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("USA");
        treeSet.add("Germany");
        treeSet.add("Italy");
        treeSet.add("France");
        treeSet.add("Canada");
        treeSet.add("Mexico");
        treeSet.add("Peru");
        treeSet.add("Argentina");
        treeSet.add("Brazil");
        treeSet.add("Moldova");
        System.out.println(treeSet);
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
