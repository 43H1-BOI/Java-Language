/*
Write a Java Program to Check
Whether the Entered Digit is Integer or Not
*/
package Basics.Questions;

import java.util.Scanner;
public class Integer_or_Not {
    public static void main(String[] args) {
        System.out.println("Program to Check Whether Entered Number is Integer or Not");
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        boolean x = Sc.hasNextInt();
        if (x){
            System.out.println("Entered Number is Integer");
        } else System.out.println("Entered Number is Not an Integer");
    }
}
