package Java_practice_code.Multithreading;

class mythread extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
}

public class code1 {
    public static void main(String[]args){
        mythread t1=new mythread();
        t1.start();

    }
}


