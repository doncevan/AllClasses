package class04;

import java.util.Scanner;

public class E7ScannerString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();

        if (name.equals("Ivan")) {
            System.out.println("Mac user");
        } else if (name.equals("Jana")) {
            System.out.println("Windows user");
        } else if (name.equals("Safyan")) {
            System.out.println("Sergey");
        } else if (name.equals("Daniel")) {
            System.out.println("Emma");
        }
    }
}