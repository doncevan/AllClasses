package class01;

import java.util.Arrays;

public class LargestNunArray {
    public static void main(String[] args) {
        int[] numbers = {112, 32, 61, 16, 89, 74, 25, 2};
        Arrays.sort(numbers);
        System.out.println("Smallest " + numbers[0]);
        System.out.println("Biggest " + numbers[numbers.length - 1]);
        System.out.println("Second Largest " + numbers[numbers.length - 2]);
    }
}
