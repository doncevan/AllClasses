package from_Internet;

public class ArrayContainsElement {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15, 19};
        int target = 19;
        boolean contains = false;
        for (int num : numbers) {
            if (num == target) {
                contains = true;
                break;
            }
        }
        if (contains) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }
}
/* Check if Array Contains a Specific Element:
Algorithm:

Initialize a boolean variable contains to false.
Iterate through each element in the array.
If the current element is equal to the target element, set contains to true and break out of the loop.
Print whether the array contains the target element based on the value of contains. */