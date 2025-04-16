package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Checking_Power_of_2 {
    static Scanner Sc = new Scanner(System.in);

    public static boolean Checking(int num) {
//        System.out.println("Program to Check if Number is Power of 2 or not :: ");
        if ((num & (num - 1)) == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println("Program to Check if Number is Power of 2 or not :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();

        if (Checking(num)) {
            System.out.println(num + " is Power of 2");
        } else System.out.println(num + " is not Power of 2");

    }
}
