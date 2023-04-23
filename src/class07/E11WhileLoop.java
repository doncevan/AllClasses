package class07;

public class E11WhileLoop {
    public static void main(String[] args) {
        int counter = 100;
        while (counter >= 1) {
            System.out.print(counter + " ");
            counter--;
        }
        counter = 20;
        System.out.println();
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter += 2;
        }
        counter = 100;
        System.out.println();
        while (counter >= 1) {

            if (counter % 2 != 0) {
                System.out.print(counter + " ");
            }
            counter--;

        }
    }
}
