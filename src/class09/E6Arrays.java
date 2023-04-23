package class09;

public class E6Arrays {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        char[] symbols = {'!', '$', '#', '&', '%'};
        for (int i = 0; i <symbols.length; i += 2) {
            System.out.print(symbols[i]+" ");

        }
    }
}