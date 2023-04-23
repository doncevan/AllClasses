package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {100, 20, 45, 89};
        int[] arr1 = {120, 10, 455, 859};
        int[] arr2 = {160, 250, 10, 189};

        int number = 100;
        int number1 = 10;
        int number2 = 10;

        ArrayUtil obj=new ArrayUtil();
        obj.searchArray(arr,number);
        obj.searchArray(arr1,number1);
        obj.searchArray(arr2,number2);
    }

    void searchArray(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Yes");
                break;
            }
        }
    }
}