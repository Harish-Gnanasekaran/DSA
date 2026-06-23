package OOPS;

interface VehicleInterface {
    void start();
}

class BikeInterface implements VehicleInterface {

    @Override
    public void start() {
        System.out.println("Bike starts");
    }
}

public class oops8 {
    public static void main(String[] args) {

        BikeInterface b1 = new BikeInterface();
        b1.start();
    }
}