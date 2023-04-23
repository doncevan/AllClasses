package class08;

public class E14NestedLoop {
    public static void main(String[] args) {
        for (int j = 1; j < 3; j++) { // outer loop for rows
            for (int i = 1; i <4; i++) { // inner loop for values of the rows
                System.out.println( j + " "+i);  // increment value of rows by 1
            }

        }
    }
}