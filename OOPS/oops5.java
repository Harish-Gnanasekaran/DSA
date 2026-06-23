package OOPS;

class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {

    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class oops5 {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.run();
    }
}