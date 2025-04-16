package Basics.Functions_8;

import java.util.Scanner;

public class PrimeTillN {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void nPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        nPrime(n);
//        if (isPrime(n)) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not Prime");
//        }
    }
}
