package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Bit_Manipulation_Combined {
    static Scanner Sc = new Scanner(System.in);


    public static int Set_ith_bit(int num, int i) {
//        System.out.println("Program to Set ith Bit :: ");
//        num = (num | (1 << i));
        return (num | (1 << i));
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

}
