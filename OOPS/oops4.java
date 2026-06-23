package OOPS;

class Person {

    void walk() {
        System.out.println("He is walking");
    }
}

class Student extends Person {

    void study() {
        System.out.println("He is studying");
    }
}

public class oops4 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.walk();
        s1.study();
    }
}