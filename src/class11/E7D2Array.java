package class11;

public class E7D2Array {
    public static void main(String[] args) {
        // with the help of loop counter how many times we have true in this array
        boolean[][] arr2D = {{true, false, true, true, false},
                {true, false, false, false, false}

        };
        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {
                if (bool == true) { // can be replaced with (bool)
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}




