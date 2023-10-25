class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
        System.out.println("Vehicle parameterized constructor called.");
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, int year, int numberOfDoors) {
        super(make, year); 
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called.");
    }

    @Override
    public void start() {
        super.start(); 
        System.out.println("Car is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.start();
        myCar.stop();
    }
}
