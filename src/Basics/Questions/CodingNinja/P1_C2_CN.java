package Basics.Questions.CodingNinja;

import java.util.Scanner;

/*
Write a program that takes a character as input and prints
1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
*/
public class P1_C2_CN {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        // Making  a Char type Element
        char any = Sc.next().charAt(0);
        // Checking Conditions
        if ((any >= 'A') && (any <= 'Z')) {
            System.out.print("1");
        } else if ((any >= 'a') && (any <= 'z')) {
            System.out.print("0");
        } else System.out.print("-1");
    }
}