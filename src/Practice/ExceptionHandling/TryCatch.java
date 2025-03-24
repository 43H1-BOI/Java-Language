package Practice.ExceptionHandling;

import java.util.*;

public class TryCatch {
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program to perform Arithmetic Operations on 2 Numbers \n");

        System.out.print("Enter 1st Number : ");
        int num1 = Sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = Sc.nextInt();


        // Addition
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        // Subtraction
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        // Multiplication
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        // Division
        try {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Not Possible");
        }

        System.out.println("Program Executed Successfully !");
    }
}
