package class08;

public class E13NestedLoop {
    public static void main(String[] args) {
      /* print this: 1 2 3 4 5
                     2 3 4 5 6
                     3 4 5 6 7  */

        for (int j = 0; j < 3; j++) { // outer loop for rows
            for (int i = 1; i <= 5; i++) { // inner loop for values of the rows
                System.out.print(i + j + " ");  // incriment value of rows by 1
            }
            System.out.println();
        }

    }
}