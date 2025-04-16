package Basics.OOPs_9.Abstraction.Interface;

import java.util.Scanner;

/*
    We can Perform Multiple Inheritance using interfaces.
    We must require at-least 2 interfaces to perform Multiple Inheritance and  will implement both
    of them using below given syntax :

    class <ClassName> implements <Interface_1> , <Interface_2> , etc. {

    }
*/
public class Multiple_Inheritance_using_Interface {

    static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println("Program to Perform Calculations on Two Numbers : ");

        System.out.print("Enter 1st Number : ");
        int a = Sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int b = Sc.nextInt();

        System.out.println();

        System.out.print("Addition : " + a + " + " + b + " = ");
        System.out.println(c1.add(a, b) + "\n");

        System.out.print("Subtraction : " + a + " - " + b + " = ");
        System.out.println(c1.sub(a, b) + "\n");

        System.out.print("Multiplication : " + a + " * " + b + " = ");
        System.out.println(c1.mult(a, b) + "\n");

        System.out.print("Division : " + a + " / " + b + " = ");
        System.out.println(c1.div(a, b) + "\n");

        System.out.print("Modulo : " + a + " % " + b + " = ");
        System.out.println(c1.mod(a, b) + "\n");

    }

    interface Addition { // To Add Two Numbers
        int add(int a, int b);
    }

    interface Subtract { // To Subtract Two Numbers
        int sub(int a, int b);
    }

    interface Divide { // To Divide Two Numbers
        double div(int a, int b);
    }

    interface Multiply { // To Multiply Two Numbers
        int mult(int a, int b);
    }

    interface Modulo { // To Find Modulo Two Numbers
        double mod(int a, int b);
    }

    static class Calculator implements Addition, Subtract, Divide, Multiply, Modulo {
        public int add(int a, int b) {
            return (a + b);
        }

        public double div(int a, int b) {
            return (double) (a / b);
        }

        public int mult(int a, int b) {
            return (a * b);
        }

        public int sub(int a, int b) {
            return (a - b);
        }

        public double mod(int a, int b) {
            return (double) (a % b);
        }
    }

}