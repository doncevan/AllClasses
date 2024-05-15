package from_Internet;


import java.util.ArrayList;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(5);
        numbers.add(55);
        numbers.add(10);
        numbers.add(77);
        numbers.removeIf(i -> i <= 10);  //following commented out lines do same thing as this line
        /* Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }*/
            System.out.println(numbers);
        }
    }