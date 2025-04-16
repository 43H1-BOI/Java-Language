package Basics.Conditional_4;

import java.util.Scanner;

public class Calculator_using_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Addition : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication : " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println("Division : " + (num1 / num2));
                    else
                        System.out.println("Error: Division by zero.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 5);
    }
}