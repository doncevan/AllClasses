package from_Internet;

import java.util.Arrays;

public class ParallelOperationsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Sequential stream processing
        int sumSequential = Arrays.stream(numbers)
                .sum();
        System.out.println("Sequential sum: " + sumSequential);

        // Parallel stream processing
        int sumParallel = Arrays.stream(numbers)
                .parallel()
                .sum();
        System.out.println("Parallel sum: " + sumParallel);
    }
}
/*The output shows that both sequential and parallel processing result in the same sum of 55.
However, the parallel sum may be computed faster due to the parallel execution of the stream.*/