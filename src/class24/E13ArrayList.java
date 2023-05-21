package class24;

import java.util.ArrayList;

public class E13ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
        evenNumbers.removeIf(x -> x % 5 == 0);
        System.out.println(evenNumbers);
    }
}
