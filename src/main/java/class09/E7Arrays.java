package class09;

public class E7Arrays {
    public static void main(String[] args) {
        /* create an array to store 10, 50, 60, 45, 100 then print elements which present on odd indexes*/
        int[] num = {10, 50, 60, 45, 100};
        for (int i = 1; i < num.length; i+=2) {
                System.out.print(num[i] + " ");
            }
        }
    }
