package from_Internet;

interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Honking the horn");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike");
    }

    @Override
    public void honk() {
        System.out.println("Bike horn sound");
    }
}

class DefaultMethodsExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        car.honk();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
        bike.honk();
    }
}