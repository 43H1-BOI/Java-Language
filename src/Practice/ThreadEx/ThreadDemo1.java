package Practice.ThreadEx;

class MyThread extends Thread {
    // initiated run method for Thread
    public void run() {
        String str = "Thread Started Running...";
        System.out.println(str);
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
