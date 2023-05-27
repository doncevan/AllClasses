package class09;

public class E11EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers={45, 50, 20, 30, -50, 45};
        // after the array type 'iter' and IntelliJ will write an enhanced for loop for you
        for (int number : numbers) {
            System.out.print(number+"  ");

        }
    }
}
