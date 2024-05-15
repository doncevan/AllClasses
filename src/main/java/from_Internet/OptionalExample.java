package from_Internet;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "John Doe";
        Optional<String> optionalName = Optional.ofNullable(name);

        // Checking if a value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        } else {
            System.out.println("Name is absent");
        }

        // Performing an action if a value is present
        optionalName.ifPresent(n -> System.out.println("Length of name: " + n.length()));

        // Getting a default value if a value is absent
        String defaultValue = optionalName.orElse("Unknown");
        System.out.println("Default value: " + defaultValue);

        // Throwing an exception if a value is absent
        try {
            String value = optionalName.orElseThrow(() -> new RuntimeException("Value is absent"));
            System.out.println("Value: " + value);
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}