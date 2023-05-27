package class08;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        // print all numbers from 5 to 50 with step 5, user inputs all three entries
        Scanner scan = new Scanner(System.in);
        System.out.println("enter start number");
        int start = scan.nextInt();
        System.out.println("enter end number");
        int end = scan.nextInt();
        System.out.println("enter step");
        int step = scan.nextInt();
        int num = start;
        while (num <= end) {
            System.out.print(num + " ");
            num = num + step;
        }
    }
}
