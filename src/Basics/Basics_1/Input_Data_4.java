package Basics.Basics_1;

import java.util.Scanner;

public class Input_Data_4{
    public static void main(String[] args){
        System.out.println("Program to get Input from User :: ");
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        byte a = Sc.nextByte();
        System.out.print("Enter 2nd Number : ");
        byte b = Sc.nextByte();

        System.out.println("Printing Entered Numbers :: ");
        System.out.print("1st Number : " + a + " and 2nd Number : " + b);
    }
}