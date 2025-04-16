package Basics.Bit_Manipulation_9;

import java.util.Scanner;

// To count number of 1 Bits of a number
public class Count_Set_Bits {
    static Scanner Sc = new Scanner(System.in);

    public static int Counting_1_bits(int num) {
//        System.out.println("Program to Count Set Bits of Number :: ");
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Program to Count Set Bits of Number :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();

        System.out.print("Number of Set Bits in " + num + " = ");
        System.out.println(Counting_1_bits(num));

    }
}
