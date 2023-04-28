package class12;

public class CarTester {
    public static void main(String[] args) {
        Car realCar=new Car();
        realCar.make="Honda";
        realCar.model="Pilot";
        realCar.year=2022;
        realCar.weight=4500;
        realCar.color="Blue";

        realCar.drive();
        realCar.turn();
        realCar.honk();
    }
}
