package Basics.Questions.CodingNinja;

/*
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E), and Step Size (W),
you need to convert all Fahrenheit values from Start to End at the gap of W into their corresponding
Celsius values and print the table.

Note:
Print the floor of the Celsius values if they are non-negative else print its ceil value.
*/
import java.util.*;

public class P4_C2_CN {
    public static void ferToCel(int S, int E, int W) {
        for (int i = S; i <= E; i += W) {
            int inC = ((i-32)*5)/9;
//            System.out.println(i + " \t " + inC);
            System.out.format("%-5s:%5s\n", i , inC);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Convert Fer. to Celsius :: ");
        System.out.print("Enter Start Value (in Fahrenheit ): ");
        int S = Sc.nextInt();
        System.out.print("Enter End Value (in Fahrenheit ): ");
        int E = Sc.nextInt();
        System.out.print("Enter Step Size : ");
        int W = Sc.nextInt();

        System.out.println("Processing...");
        System.out.println("Celsius \t Fahrenheit");
        ferToCel(S, E, W);


    }
}

