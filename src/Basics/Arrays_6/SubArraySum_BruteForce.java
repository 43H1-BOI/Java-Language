package Basics.Arrays_6;

import java.util.Scanner;

public class SubArraySum_BruteForce {
    public static int[] getArr() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = Sc.nextInt();
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SubArrSum(int[] arr) {
        int maxSum = arr[0]; // Max Sum initialized as arr[0]
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0; // Current Sum will become 0 for each SubArray
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
                currSum += arr[j];
            }
            System.out.println("\nSum of Above SubArray is " + currSum + "\n");
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        System.out.println("\nMax Sum from Above SubArrays are " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\nPerforming Brute Force for Sum of Sub Arrays : ");
        SubArrSum(arr);
    }
}
