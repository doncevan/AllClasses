package class30;

public class E10Methods {
    public static void main(String[] args) {
        /*
        Create a method that will take an array of ints and will return the sum of the elements of the array method
        should be accessible throughout the project and method should be callable by just writing the name of the class.
         */
        int[] numbers = {10, 7, 5, 12, 6};
        int result = sumArr(numbers);
        System.out.println(result);
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}