package OOPS;

class Calculator {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class oops6 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        System.out.println(c1.multiply(4, 2));
        System.out.println(c1.multiply(3, 4, 5));
    }
}