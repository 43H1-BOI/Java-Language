package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Set_ith_Bit {
    static Scanner Sc = new Scanner(System.in);

    public static int Set_ith_bit(int num, int i) {
//        System.out.println("Program to Set ith Bit :: ");
//        num = (num | (1 << i));
        return (num | (1 << i));
    }

    public static void main(String[] args) {
        System.out.println("Program to Set ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter i-th Position ( From Right ): ");
        int i = Sc.nextInt();

        if (i == 1) {
            System.out.println("After Setting " + i + "st Bit in " + num + " : ");
        } else if (i == 2) {
            System.out.println("After Setting " + i + "nd Bit in " + num + " : ");
        } else if (i == 3) {
            System.out.println("After Setting " + i + "rd Bit in " + num + " : ");
        } else {
            System.out.println("After Setting " + i + "th Bit of " + num + " : ");
        }

        System.out.println("Number = " + Set_ith_bit(num, i));
    }
}
