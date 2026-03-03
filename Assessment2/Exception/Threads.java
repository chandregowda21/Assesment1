package Exception;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable interface");
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}