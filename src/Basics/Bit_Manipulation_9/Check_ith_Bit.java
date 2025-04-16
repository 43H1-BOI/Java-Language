package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Check_ith_Bit {
    static Scanner Sc = new Scanner(System.in);

    public static byte Get_ith_Bit(int num, int i) {
//        System.out.println("Program to Get ith Bit :: ");
        if ((num & (1 << i)) == 0) {
            return 0;
        } else return 1;
    }

    public static void main(String[] args) {
        System.out.println("Program to Get ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter i-th Position ( From Right ): ");
        int i = Sc.nextInt();

        if (i == 1) {
            System.out.print(i + "st Bit of " + num + " = ");
        } else if (i == 2) {
            System.out.print(i + "nd Bit of " + num + " = ");
        } else if (i == 3) {
            System.out.print(i + "rd Bit of " + num + " = ");
        } else {
            System.out.print(i + "th Bit of " + num + " = ");
        }

        System.out.println(Get_ith_Bit(num, i));
    }
}
