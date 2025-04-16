package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Clear_ith_Bit {
    static Scanner Sc = new Scanner(System.in);

    public static int Clear_ith_bit(int num, int i) {
//        System.out.println("Program to Clear ith Bit :: ");
        return (num & (~(1 << i)));
    }

    public static void main(String[] args) {
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter i-th Position ( From Right ): ");
        int i = Sc.nextInt();

        if (i == 1) {
            System.out.println("After Clearing " + i + "st Bit in " + num + " : ");
        } else if (i == 2) {
            System.out.println("After Clearing " + i + "nd Bit in " + num + " : ");
        } else if (i == 3) {
            System.out.println("After Clearing " + i + "rd Bit in " + num + " : ");
        } else {
            System.out.println("After Clearing " + i + "th Bit of " + num + " : ");
        }

        System.out.println("Number = " + Clear_ith_bit(num, i));
    }
}
