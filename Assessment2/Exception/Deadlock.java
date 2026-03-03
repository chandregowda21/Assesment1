package Exception;

public class Deadlock {
    static final Object obj1 = new Object();
    static final Object obj2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                synchronized (obj2) {
                    System.out.println("Thread 1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                synchronized (obj1) {
                    System.out.println("Thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}