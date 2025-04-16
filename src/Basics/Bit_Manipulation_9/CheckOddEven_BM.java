package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class CheckOddEven_BM {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Check Whether a Number is Even or Odd ");
        System.out.print("Enter a Number to Check : ");
        int a = Sc.nextInt();

        if ((a & 1) != 1) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }
}
