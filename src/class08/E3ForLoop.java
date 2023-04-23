package class08;

public class E3ForLoop {
    public static void main(String[] args) {
        // add all even numbers from 1 to 30
        int sum=0;// a variable to hold the sum
        for(int i=1;i<=30;i++) {
            if (i % 2 == 0) { // checking if number is even
                sum = sum + i; //adding all even numbers to the sum

            }
        }
        System.out.print(sum);
    }
}
