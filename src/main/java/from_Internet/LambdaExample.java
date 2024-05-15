package from_Internet;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Using Lambda expression to iterate and print each name
        names.forEach(name -> System.out.println(name));
        System.out.println("************************");

        // Using Lambda expression with functional interface to filter names starting with 'A'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(filteredName -> System.out.println(filteredName));
    }
}