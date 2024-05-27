package class11;

public class E3D2Array {
    public static void main(String[] args) {
        // print  numbers using enhanced loop
        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5,},
                {10, 8, 6, 4, 2}
        };
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                System.out.print(num+" ");
            }
           System.out.println();
        }
    }
}
