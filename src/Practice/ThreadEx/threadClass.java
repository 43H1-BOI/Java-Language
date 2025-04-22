package Practice.ThreadEx;

import java.util.Random;

class threadClass {
    public static void main(String[] args) {
        Table t1 = new Table();
//      Table t2 = new Table();
        Divisor d1 = new Divisor();
        Thread th = new Thread(d1);

        // Thread d2 = new Thread(d1);
        // t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        /*
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        t2.start();
        */

        th.start();
//        Can't use this
//        d1.start();
//        d1.setPriority(Thread.MIN_PRIORITY);
    }
}

class Divisor implements Runnable {
    public void run() {
        Random random = new Random();
        Table t = new Table();
        t.printTable(random.nextInt(1, 100));
    }

    public void printDivisor(int num) {
        int i = 1;
        System.out.print("Divisor of " + num + " : ");
        while (i != 100) {
            if (num % i == 0) System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}

class Table extends Thread {
    Random random = new Random();

    public void run() {
        int num = random.nextInt(1, 96);
        printTable(num);
    }

    public void printTable(int num) {
        int i = 1;
        while (i != 11) {
            System.out.println(num + " x " + i + " = " + (i * num));
            i++;
        }
    }
}