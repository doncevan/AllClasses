package from_Internet;

public class RemoveDuplicatesFromSortedArray {
        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};
            int length = removeDuplicates(nums);
            System.out.println("Length of unique elements: " + length);
            System.out.print("Unique elements: ");
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
        }

        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int uniqueIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[uniqueIndex]) {
                    uniqueIndex++;
                    nums[uniqueIndex] = nums[i];
                }
            }
            return uniqueIndex + 1;
        }
    }
    /* Remove Duplicates from Sorted Array:
Remove the duplicates in a sorted array, modifying the array in-place.

Algorithm:

Initialize a variable uniqueIndex to 0.
Iterate through the array from index 1.
If the current element is different from the element at uniqueIndex, increment uniqueIndex and update the element at that index.
Continue the iteration until the end of the array.
The unique elements are now in the subarray nums[0] to nums[uniqueIndex]. */
