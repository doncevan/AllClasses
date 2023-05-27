package class08;

public class E7NestedLoop {
    public static void main(String[] args) {
        // !!! see E6NestedLoop !!!

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // prints in separate lines
        }
    }
}