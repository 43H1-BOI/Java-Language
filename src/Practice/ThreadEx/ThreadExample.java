package Practice.ThreadEx;

public class ThreadExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread T = new Thread(t2);

//        for (int i = 0; i < 50; i++) {
//            System.out.println("Main : " + i);
//            try {
//                Thread.sleep(10); // Pause for .01 second
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
        t1.start();
        T.start();
    }
}

// Method 1: Extending Thread class
class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello : " + i);
            System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000); // pause for 1 second
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
        }
    }
}

// Method 2: Implementing Runnable interface
class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hi : " + i);
            System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000); // pause for 1 second
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
        }
    }
}
