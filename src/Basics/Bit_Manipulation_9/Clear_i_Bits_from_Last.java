package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Clear_i_Bits_from_Last {

    static Scanner Sc = new Scanner(System.in);

    public static int Clear_ith_bit(int num, int i) {
//        System.out.println("Program to Clear ith Bit :: ");
        return (num & (~(1 << i)));
    }

    public static int Clear_i_bits(int num, int i) {
//        System.out.println("Program to Clear i Bits from Last :: ");
        i--;
        while (i >= 0) {
            num = Clear_ith_bit(num, i);
            i--;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter Number of Bits to be Removed (From Right Position): ");
        int i = Sc.nextInt();

        if (i == 1) {
            System.out.println("After Clearing Last " + i + " Bits from " + num + " : ");
        } else if (i == 2) {
            System.out.println("After Clearing Last " + i + " Bits from " + num + " : ");
        } else if (i == 3) {
            System.out.println("After Clearing Last " + i + " Bits from " + num + " : ");
        } else {
            System.out.println("After Clearing Last " + i + " Bits from " + num + " : ");
        }

        System.out.println("Number = " + Clear_i_bits(num, i));
    }
}