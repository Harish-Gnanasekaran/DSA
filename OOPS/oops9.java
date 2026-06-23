package OOPS;

class PersonConstructor {

    PersonConstructor() {
        System.out.println("Person Constructor");
    }
}

class StudentConstructor extends PersonConstructor {

    StudentConstructor() {
        super();
        System.out.println("Child Constructor");
    }
}

public class oops9 {
    public static void main(String[] args) {

        StudentConstructor s = new StudentConstructor();
    }
}