package Core_Java.Threads;

import java.util.*;

public class Thread1Ex extends Thread {

    // Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
    public static void main(String[] args) {
        Thread1Ex t1 = new Thread1Ex();
        t1.start();
        System.out.println("Hello");

    }

    public void run() {
        System.out.println("Hello World");
    }
}