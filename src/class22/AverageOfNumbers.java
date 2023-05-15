package class22;
                    //In Java create a method to get the average of numbers from an array.
public class AverageOfNumbers {
    public static double average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}