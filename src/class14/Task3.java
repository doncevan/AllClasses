package class14;

public class Task3 {
    boolean isPrime(int num) {
        boolean isPrimeNum = true;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }

            if (count > 1) {
                isPrimeNum = false;
            }
        }
        return isPrimeNum;
    }
}

