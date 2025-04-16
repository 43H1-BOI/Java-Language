package Basics.Bit_Manipulation_9;

import java.util.Scanner;

public class Fast_Exponential {
    static Scanner Sc = new Scanner(System.in);

    public static int Fast_Expo(int num, int pow) {
//        System.out.println("Program to Check Exponential (Fast Method) :: ");
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = ans * num;
            }
            num *= num;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Program to Check Exponential (Fast Method) :: ");
        System.out.print("Enter Any Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter Power of Number : ");
        int pow = Sc.nextInt();

        System.out.print(num + " to the power of " + pow + " = ");
        System.out.println(Fast_Expo(num, pow));

    }
}
