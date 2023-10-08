package class01;

public class LargestNunArrayNoInbuilt {
    public static void main(String[] args) {
        int[] numbers = {1, 110, -1, 90, 16, 200, 89, 74, 89, -25, 100};
        int smallest = numbers[0];
        int largest = 0;
        int largest2 = 0;
        for (int element : numbers) {
            if (element > largest) {
                largest2 = largest;
                largest = element;
            } else if (element > largest2 && element != largest) {
                largest2 = element;
            }
            if (element < smallest) {
                smallest = element;
            }
        }
        System.out.println("Smallest " + smallest);
        System.out.println("Biggest " + largest);
        System.out.println("Second Largest " + largest2);
    }
}
