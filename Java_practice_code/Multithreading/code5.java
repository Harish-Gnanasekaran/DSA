package Java_practice_code.Multithreading;

class MyThread1 extends Thread {

    public void run() {

        System.out.println("Running");

        try {
            Thread.sleep(1000);
        } catch(Exception e) {}

        System.out.println("Finished");
    }
}

public class code5 {

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();



        t1.start();
    }
}