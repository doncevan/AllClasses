package from_Internet;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 7, 12, 1, 9, 3};
        int target = 9;

        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
/* Linear Search: Find Index of an Element in an Array:
Algorithm:

Initialize a variable target with the element to search.
Iterate through each element in the array.
If the current element is equal to the target, return the current index.
If the loop completes without finding the element, return -1. */