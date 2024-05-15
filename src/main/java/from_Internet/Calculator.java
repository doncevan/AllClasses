package from_Internet;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.calculate(5, 3));

        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.calculate(8, 4));

        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.calculate(6, 2));
    }
}