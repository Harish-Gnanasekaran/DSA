package Java_practice_code.Multithreading;

class MyThreadnew extends Thread {

    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

public class code3 {

    public static void main(String[] args) {

        MyThreadnew t = new MyThreadnew();

        System.out.println("Before");

        t.start();

        System.out.println("After");
    }
}