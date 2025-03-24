package Basics.Functions_8;

import java.util.Scanner;

public class TempConversion {
    public static float CelToFerh(float Cel) {
        return (float) ((Cel * 9) / 5) + 32;
    }

    public static float FerhToCel(float Ferh) {
        return (float) ((Ferh - 32) * 5) / 9;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nProgram For Conversion of Temperature :: ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. End Program");
            System.out.print("\nChoose From Given Options : ");
            choice = Sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Fahrenheit to Celsius :");
                    System.out.print("Enter Temperature (in Fahrenheit) : ");
                    float ferh = Sc.nextFloat();
                    System.out.println("Temperature in Celsius = " + FerhToCel(ferh));
                    break;

                case 2:
                    System.out.println("2. Celsius to Fahrenheit:");
                    System.out.print("Enter Temperature (in Celsius) : ");
                    float cel = Sc.nextFloat();
                    System.out.println("Temperature in Fahrenheit = " + CelToFerh(cel));
                    break;

                case 3:
                    System.out.println("3. Ending Program");
                    break;

                default:
                    System.out.println("Invalid Input ...");
                    System.out.println("Restarting Program ");
                    break;
            }
        } while (choice != 3);
        System.out.println("Thanks For Using Our Program :) ");
    }
}

// Formula :- (°C × 9)/5 + 32 = °F
// (°C × 9/5) + 32 = °F

// (°F − 32) × 5/9 = °C

