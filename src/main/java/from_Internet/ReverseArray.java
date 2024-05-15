package from_Internet;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            // Move indices towards the center
            start++;
            end--;
        }
        // Print reversed array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
/* Reverse an Array:
Algorithm:

Initialize variables start to 0 and end to the last index of the array.
Use a while loop with the condition start < end to swap elements at positions start and end.
Increment start and decrement end in each iteration.
Print the reversed array. */