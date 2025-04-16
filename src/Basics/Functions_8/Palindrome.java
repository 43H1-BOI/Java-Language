package Basics.Functions_8;

import java.util.Scanner;

public class Palindrome {
    public static boolean Palin(int num) {
        int rem = 0;
        int rev = 0;
        int temp = num;

        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        if (temp == rev) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        if (Palin(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
