package class04;

import java.util.Scanner;

public class E8ScannerInt {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary= scanner.nextInt();
        if(salary>100000){
            System.out.println("You are rich");
        }else{
            System.out.println("Look for better opportunities");
        }
    }
}
