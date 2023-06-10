package class30;

public class E1Methods_1 {
    public static void main(String[] args) {
        E1Methods_1 x = new E1Methods_1();
        x.printOf("World");
        x.printOf("Java");
        x.printOf("Batch16");
    }

    public void printOf(String input) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello " + input);
        }
    }
}