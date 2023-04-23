package class08;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        // Ask user to enter any number and print "Hello world" and keep asking a new number till they enter -1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        while (num != -1) {
            System.out.println("Hello world");
            System.out.println("Enter a number");
            num = scan.nextInt();// this request is inside of loop needed, other-ways it will keep going infinite
        }
    }
}
