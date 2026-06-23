package OOPS;

class Student1 {
    private String name;
    private int mark;

    void setName(String name) {
        this.name = name;
    }

    void setMark(int mark) {
        if (mark > 0) {
            this.mark = mark;
        }
    }

    String getName() {
        return name;
    }

    int getMark() {
        return mark;
    }
}

public class oops1 {
    public static void main(String[] args) {

        Student1 e1 = new Student1();

        e1.setName("Harish");
        e1.setMark(80);

        System.out.println(e1.getName());
        System.out.println(e1.getMark());
    }
}