// Q. Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.

class Vehicle {
    public void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }
}

class Car extends Vehicle {
    public void speedUp() {
        System.out.println("Car is speeding up by 20 km/h");
    }
}

class Bicycle extends Vehicle {
    public void speedUp() {
        System.out.println("Bicycle is speeding up by 5 km/h");
    }
}

public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.speedUp();
        bicycle.speedUp();
    }
}
