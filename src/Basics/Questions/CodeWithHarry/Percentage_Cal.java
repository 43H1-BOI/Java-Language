/*
 Write a program to calculate percentage of a given
 student in CBSE Board Exam . Take Marks of all 5
 subjects from keyboard
*/

package Basics.Questions;

import java.util.Scanner;

public class Percentage_Cal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Calculate Percentage :: ");
        System.out.print("Enter Your Full Name : ");
        String name = Sc.nextLine();
        System.out.println("Enter Your Marks For Each Subject :: ");
        System.out.print("English : ");
        byte English = Sc.nextByte();
        System.out.print("Hindi : ");
        byte Hindi = Sc.nextByte();
        System.out.print("Maths : ");
        byte Maths = Sc.nextByte();
        System.out.print("Physics : ");
        byte Physics = Sc.nextByte();
        System.out.print("Chemistry : ");
        byte Chemistry = Sc.nextByte();

        System.out.println("Marks of " + name + " is : ");
        System.out.println("English : " + English);
        System.out.println("Hindi : " + Hindi);
        System.out.println("Maths : " + Maths);
        System.out.println("Physics : " + Physics);
        System.out.println("Chemistry : " + Chemistry);
        System.out.println(" ");
        byte Percentage = (byte) ((English+Hindi+Maths+Physics+Chemistry)/5);
        System.out.println("Percentage : " + Percentage + " % ");
        System.out.print("Result : ");

        if (Percentage < 35){
            System.out.print("Fail");
        }  else System.out.print("Pass");

    }

}
