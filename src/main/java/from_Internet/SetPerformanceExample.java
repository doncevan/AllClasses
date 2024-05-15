package from_Internet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPerformanceExample {

    public static void main(String[] args) {
        int numElements = 1000000;

        long startTime = System.nanoTime();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;

        startTime = System.nanoTime();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.add(i);
        }
        endTime = System.nanoTime();
        long linkedHashSetTime = endTime - startTime;

        startTime = System.nanoTime();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numElements; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long treeSetTime = endTime - startTime;

        System.out.println("HashSet Time (ns): " + hashSetTime);
        System.out.println("LinkedHashSet Time (ns): " + linkedHashSetTime);
        System.out.println("TreeSet Time (ns): " + treeSetTime);
    }
}
