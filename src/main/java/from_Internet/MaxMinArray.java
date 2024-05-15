package from_Internet;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5, 12, 45, 0, 25, -15, 3};
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
/* Find Maximum and Minimum in an Array:
Algorithm:

Initialize variables max and min with the first element of the array.
Iterate through each element in the array.
If the current element is greater than max, update max.
If the current element is less than min, update min.
Print the final values of max and min.   */