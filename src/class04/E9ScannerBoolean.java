package class04;

import java.util.Scanner;

public class E9ScannerBoolean {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Are yoy hungry Enter true/false");
        boolean hungry=scanner.nextBoolean();
        if(hungry){
            System.out.println("Let's order Pizza");
        }else{
            System.out.println("Let's practice Java");
        }
    }
}
