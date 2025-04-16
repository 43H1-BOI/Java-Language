package Basics.Basics_1;

import java.util.Scanner;

public class Sum_And_Avg_Of_Given_Integers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number of integers you are entering : ");
        int noOfArgs = Sc.nextInt();
        int[] nums = new int[noOfArgs]; // array of size noOfArgs
        int sum = 0;

        System.out.println("Enter numbers one-by-one : ");
        for (int i = 0; i < noOfArgs; i++) {
            nums[i] = Sc.nextInt();
            sum += nums[i];
        }

        System.out.println("\nEntered numbers are : ");
        for (int i : nums)
            System.out.print(i + " ");

        System.out.println("\nSum of Given Integers = " + sum);
        System.out.println("Average of Given Integers = " + (float) (sum / noOfArgs));

    }
}
