package Basics.Loops_5;

import java.util.Scanner;

// Sum of first n even Numbers using while loop
public class Sum_Of_n_Even_Integer {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Number of Even Integer of Find Sum of :: ");
        int num = Sc.nextInt();
        int sum = 0, i = 0;
        System.out.println("\n" + num + " Even Integers Are :: ");
        while (i < num*2) {
            i+= 2;
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println("\nSum of " + num + " Even Integers = " + sum);
    }
}
