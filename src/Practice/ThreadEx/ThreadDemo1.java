package Practice.ThreadEx;

class MyThread extends Thread {
    // initiated run method for Thread
    public void run() {
        String str = "Thread Started Running...";
        System.out.println(str);
    }
}

class RunThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
