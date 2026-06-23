package OOPS;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class oops7 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.draw();
    }
}