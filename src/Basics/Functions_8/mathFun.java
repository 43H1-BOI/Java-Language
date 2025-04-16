package Basics.Functions_8;

import java.util.Scanner;

public class mathFun {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter Number 1 : ");
        num1 = Sc.nextInt();
        System.out.print("Enter Number 2 : ");
        num2 = Sc.nextInt();

        System.out.println("The \"abs()\" method returns the absolute (positive) value of a number.");
        System.out.println(Math.abs(num1));

        System.out.println("The \"max()\" method returns the maximum value from given numbers.");
        System.out.println(Math.max(num1, num2));

        System.out.println("The \"min()\" method returns the minimum value from given numbers.");
        System.out.println(Math.min(num1, num2));

        System.out.println("The \"pow()\" method returns the number raised to the power of another number (a^b).");
        System.out.println(Math.pow(num1, num2));

        System.out.println("The \"sqrt()\" method returns the square root of a number.");
        System.out.println(Math.sqrt(num1));

//        int[] a = new int[s];
//        for (int i:a) {
//            a[i] = new int[](Sc.nextInt());

    }

}
