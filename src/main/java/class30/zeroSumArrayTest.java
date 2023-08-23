package class30;

import java.util.Arrays;

public class zeroSumArrayTest {
    public static int[] zeroSumArray(int n) {
        int[] result = new int[n];
        if (n == 1) {
            result[0] = 0;
        } else {
            for (int i = 0; i < n; i++) {
                result[i] = (i + 1 - n) * 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroSumArray(1))); // [0]
        System.out.println(Arrays.toString(zeroSumArray(4))); // [-3, -1, 1, 3]
        System.out.println(Arrays.toString(zeroSumArray(5))); // [-4, -2, 0, 2, 4]

    }
}

