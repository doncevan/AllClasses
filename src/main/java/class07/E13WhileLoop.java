package class07;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        //ask the user a number, than print all the numbers from 1 to that number(last number)
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number greater than 1");
        int lastLum = scan.nextInt(); //any number from the user
        int counter = 1;
        while (counter <= lastLum) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
