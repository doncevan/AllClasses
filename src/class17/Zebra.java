package class17;

public class Zebra {
    String name;
    String color;
    int age;
    double weight;
    static int noOfLegs = 4;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    String printInfo() {
        System.out.println(name + " " + color + " " + age + " " + weight);
        return printInfo();
    }

    static void speak() {
        System.out.println("mooooooo boahhhha");


    }

    public static void main(String[] args) {
        System.out.println(Zebra.noOfLegs);
        Zebra z = new Zebra("Zib", "yellow", 10, 350);
        System.out.println(z.name);
    }

}
