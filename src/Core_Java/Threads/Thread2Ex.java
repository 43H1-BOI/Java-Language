package Core_Java.Threads;

public class Thread2Ex {
    // Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
    public static void main(String[] args) {
        oddTh odd = new oddTh();
        evenTh even = new evenTh();

        Thread t = new Thread(even);

        odd.start();
        t.start();

    }

}

class oddTh extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i = i + 2) {
            System.out.println("Odd = " + i);
        }
    }
}

class evenTh implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println("Even = " + i);
        }
    }
}