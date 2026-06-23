package OOPS;

class BikeFinal {

    final int speed = 120;

    void display() {
        System.out.println(speed);
    }
}

public class oops11 {
    public static void main(String[] args) {

        BikeFinal b1 = new BikeFinal();
        b1.display();
    }
}