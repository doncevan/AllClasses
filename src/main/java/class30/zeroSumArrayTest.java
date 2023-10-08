package class30;

import java.util.Arrays;

public class zeroSumArrayTest {
    public static int[] zeroSumArray(int N) {
        int[] result = new int[N];
        if (N == 1) {
            result[0] = 0;
        } else {
            int index = 0;
            for (int i = 1; i <= N/2; i++) {
                result[index] = i;
                index++;
                result[index] = -i;
                index++;
            }
            if (N % 2 == 1) {
                result[index] = 0;
            }
        }
        return result;
    }

  /*  public static int[] ArraySumToZero(int V) {
        int[] result = new int[V];
        int index = 0;
        for (int i = -V / 2; i <= V / 2; i++) {
            if (V % 2 == 0 && i == 0) {
                continue;
            }
            result[index] = i;
            index++;
        }
        return result;
    }*/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroSumArray(1))); // [0]
        System.out.println(Arrays.toString(zeroSumArray(4))); // [-3, -1, 1, 3]
        System.out.println(Arrays.toString(zeroSumArray(5))); // [-4, -2, 0, 2, 4]
        System.out.println(Arrays.toString(zeroSumArray(10))); // [1, -1, 2, -2, 3, -3, 4, -4, 5, -5]

    }
}

