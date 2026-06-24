package Java_practice_code.Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class code2 {

    public static void main(String[] args) {

        MyThread t3 = new MyThread();
        MyThread t2 = new MyThread();

        t3.start();
        t2.start();
    }
}
