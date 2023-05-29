package class26;

import java.util.HashSet;

public class EntrySetTester {
    public static void main(String[] args) {
        HashSet<Entry> entrySet = new HashSet<>();

        entrySet.add(new Entry("Coke", 2.0));
        entrySet.add(new Entry("Milk", 5.0));
        entrySet.add(new Entry("Mango juice", 2.5));
        for (Entry e : entrySet) {
            if (e.getKey().contains("i") && e.getValue() > 2)
                System.out.println(e.getKey() + " " + e.getValue());
        }
        HashSet<Entry> entrySet1 = new HashSet<>();

        entrySet1.add(new Entry("Coke", 2.0));
        entrySet1.add(new Entry("Milk", 5.0));
        entrySet1.add(new Entry("Mango juice", 2.5));
        entrySet1.removeIf(x -> x.getKey().contains("i") && x.getValue() > 2);
        System.out.println(entrySet1);
    }
}

