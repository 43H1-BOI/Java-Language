package Basics.Conditional_4;

import java.util.Scanner;

//To Calculate Grade of a Student
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        float marks = Sc.nextFloat();
        if (marks <= 40) System.out.println("F Grade.");
        else if ((marks >= 40) && (marks <= 50)) System.out.println("D Grade.");
        else if ((marks >= 50) && (marks <= 60)) System.out.println("C Grade.");
        else if ((marks >= 60) && (marks < 70)) System.out.println("B Grade.");
        else if ((marks >= 70) && (marks < 80)) System.out.println("B+ Grade.");
        else if ((marks >= 80) && (marks < 90)) System.out.println("A Grade.");
        else if ((marks >= 90) && (marks < 95)) System.out.println("A+ Grade.");
        else if ((marks >= 95) && (marks <= 100)) System.out.println("0 Grade.");
    }
}
