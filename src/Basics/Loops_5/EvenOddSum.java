package Basics.Loops_5;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = Sc.nextInt();
        int oddSum = 0, evenSum = 0;
        int sum = 0;
        for (int i = 0; i <= num; i += 2) {
            evenSum += i;
            oddSum += (i + 1);
        }
        for (int i = 1; i <= num; i++) {
//            oddSum += i;
            sum += i;
        }
        System.out.println("Sum of Odd Numbers till " + num + " = " + oddSum);
        System.out.println("Sum of Even Numbers till " + num + " = " + evenSum);
        System.out.println((oddSum + evenSum));
        System.out.println(sum);
    }
}
