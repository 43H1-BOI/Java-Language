package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Clear_Range_of_Bits {
    static Scanner Sc = new Scanner(System.in);

    public static int Clear_ith_bit(int num, int i) {
//        System.out.println("Program to Clear ith Bit :: ");
        return (num & (~(1 << i)));
    }

    public static int Clear_Range(int num, int i, int j) {
        //        System.out.println("Program to Clear ith Bit :: ");
        while (i <= j) {
            num = Clear_ith_bit(num, i);
            i++;
//            num = Checking(num, j);
//            j--;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter i-th Position ( From Right ): ");
        int i = Sc.nextInt();
        System.out.print("Enter j-th Position ( From Right ): ");
        int j = Sc.nextInt();

        System.out.println("After Clearing Bits from index " + j + " to " + i + " : ");
        System.out.println("Number = " + Clear_Range(num, i, j));
    }
}