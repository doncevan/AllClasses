package class09;

public class E9Arrays {
    public static void main(String[] args) {
        // print all the numbers from 6 to 0in reverse order, also print chars F to A in reverse order
        for (int i = 6; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        char[] symbols = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 5; i >=0; i--) {
            System.out.print(symbols[i]+" ");
        }
    }
}