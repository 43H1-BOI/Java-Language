package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Update_ith_Bit {
    static Scanner Sc = new Scanner(System.in);

    public static int Set_ith_bit(int num, int i) {
//        System.out.println("Program to Set ith Bit :: ");
//        num = (num | (1 << i));
        return (num | (1 << i));
    }

    public static int Clear_ith_bit(int num, int i) {
//        System.out.println("Program to Clear ith Bit :: ");
        return (num & (~(1 << i)));
    }

    public static byte Get_ith_Bit(int num, int i) {
//        System.out.println("Program to Get ith Bit :: ");
        if ((num & (1 << i)) == 0) {
            return 0;
        } else return 1;
    }

    public static int Update_ith_bit(int num, int i, int newBit) {
//        if (Get_ith_Bit(num, i) == newBit) {
//            return num;
//        } else if (newBit == 1) {
//            return Set_ith_bit(num, i);
//        } else if (newBit == 0) {
//            return Checking(num, i);
//        }
//        } else {
//            return Integer.parseInt("Wrong Input");
//        }
        num = Clear_ith_bit(num, i);
//        int Bitty = newBit << i;
        return (num | (newBit << i));
    }

    public static void main(String[] args) {
        System.out.println("Program to Update ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter i-th Position ( From Right ): ");
        int i = Sc.nextInt();
        System.out.print("Enter Bit to Update at i-th Position : ");
        int newBit = Sc.nextInt();

        if (i == 1) {
            System.out.println("After Updating " + i + "st Bit in " + num + " to " + newBit + " : ");
        } else if (i == 2) {
            System.out.println("After Updating " + i + "nd Bit in " + num + " to " + newBit + " : ");
        } else if (i == 3) {
            System.out.println("After Updating " + i + "rd Bit in " + num + " to " + newBit + " : ");
        } else {
            System.out.println("After Updating " + i + "th Bit in " + num + " to " + newBit + " : ");
        }

        System.out.print("Number = ");
        System.out.println(Update_ith_bit(num, i, newBit));
    }

}
