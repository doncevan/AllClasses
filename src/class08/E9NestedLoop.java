package class08;

public class E9NestedLoop {
    public static void main(String[] args) {
        // this is correct nested loop unlike in E8NestedLoop

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}