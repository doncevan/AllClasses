package from_Internet;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5}; // Example input array
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
/* Find the Missing Number:
Given an array containing n distinct numbers taken from the range 0 to n, find the one missing from the array.

Algorithm:

Calculate the expected sum of the first n natural numbers using the formula n * (n + 1) / 2
Calculate the actual sum of the elements in the array using a ‘for’ loop.
Subtract the actual sum from the expected sum.
The result is the missing number. */