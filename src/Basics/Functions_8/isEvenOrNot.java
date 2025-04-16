package Basics.Functions_8;

import java.util.Scanner;

public class isEvenOrNot {
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program To Check Weather a num is Even or Not :: ");
        int num = Sc.nextInt();
        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
