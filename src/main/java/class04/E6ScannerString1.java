package class04;

import java.util.Scanner;

public class E6ScannerString1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.next();

        if(name.equals("Ivan")){
            System.out.println("Mac user");
        }else{
            System.out.println("Windows user");
        }
    }
}
