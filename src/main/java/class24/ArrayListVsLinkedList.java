package class24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // compare these two

        long start1 = System.currentTimeMillis();
        List<Integer> numbers1 = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers1.add(0, i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}

