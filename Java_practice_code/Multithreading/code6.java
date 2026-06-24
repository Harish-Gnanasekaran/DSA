package Java_practice_code.Multithreading;

class MyThread2 extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }
}

public class code6 {
    public static void main(String[] args) throws Exception {

        MyThread2 t1 = new MyThread2();

        t1.start();

        t1.join();

        System.out.println("Main Finished");
    }
}
