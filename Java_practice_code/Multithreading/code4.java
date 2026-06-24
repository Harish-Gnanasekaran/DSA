package Java_practice_code.Multithreading;

class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Child Thread executing task");
    }
}

public class code4 {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);

        t1.start();

        System.out.println("Main Thread");
    }
}
