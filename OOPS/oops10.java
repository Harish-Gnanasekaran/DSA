package OOPS;

class EmployeeStatic {

    String name;
    static String company = "TCS";

    EmployeeStatic(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
        System.out.println(company);
    }
}

public class oops10 {
    public static void main(String[] args) {

        EmployeeStatic e1 = new EmployeeStatic("Harish");
        EmployeeStatic e2 = new EmployeeStatic("Dev");

        e1.display();
        e2.display();
    }
}