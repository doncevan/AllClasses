package class01;

public class ReverseInt {
    public static int reverseInteger(int N) {
        String number = String.valueOf(N);
        StringBuilder stringBuilder = new StringBuilder(number);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());

    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(12345));

    }
}
