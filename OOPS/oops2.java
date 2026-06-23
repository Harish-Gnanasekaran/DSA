package OOPS;

class Car {

    String name;
    int price;

    Car(String n, int p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println(name);
        System.out.println(price);
    }
}

public class oops2 {
    public static void main(String[] args) {

        Car c1 = new Car("Audi", 20000);
        Car c2 = new Car("BMW", 450000);

        c1.display();
        c2.display();
    }
}