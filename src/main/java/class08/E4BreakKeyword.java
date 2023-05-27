package class08;

public class E4BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break;  // breaks the execution of the loop after five iteration
            }
            System.out.print(i + " ");
        }
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum = sum + i;
            if (sum > 300) {
                System.out.println(i);
                break;


            }
        }
    }
}