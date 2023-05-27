package class09;
/*
Print numbers from 1 to 50 except those that are divisible by 3
 */
public class Task {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
