package OOPS;

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name);
        System.out.println(salary);
    }
}

public class oops3 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Harish", 20000);
        Employee e2 = new Employee("Dev", 10000);
        Employee e3 = new Employee("Thilak", 150000);

        e1.display();
        e2.display();
        e3.display();
    }
}