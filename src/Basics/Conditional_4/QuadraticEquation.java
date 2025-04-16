package Basics.Conditional_4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

// Write a Java program to solve quadratic equations (use if, else if and else)
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Java program to solve Quadratic Equations");
        System.out.println("Enter Your Quadratic Equation in the Given form :- \na(x^2) + bx + c = 0");
        System.out.print("Enter Value of a : ");
        int a = Sc.nextInt();
        System.out.print("Enter Value of b : ");
        int b = Sc.nextInt();
        System.out.print("Enter Value of c : ");
        int c = Sc.nextInt();

        System.out.println("Solution of Quadratic Equation Are :: ");
        if (a != 0 || b != 0 || c != 0) {
            System.out.println("Taking Positive Sign");
            double x1 = (double) ((-b + sqrt((b * b) - (4 * a * c))) / 2 * a);
            System.out.println("Value of x = " + x1);

            System.out.println("Taking Negative Sign");
            double x2 = (double) ((-b - sqrt((b * b) - (4 * a * c))) / 2 * a);
            System.out.println("Value of x = " + x2);
        } else if (a == 0) {
            double x = -(c * b);
            System.out.println("For a = 0 ;");
            System.out.print("Value of x = " + x);
        }
    }
}
//Formula :-
