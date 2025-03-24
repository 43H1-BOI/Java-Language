package Basics.Arrays_6;

import java.util.Scanner;

public class TargetSumTriple {
    static Scanner Sc = new Scanner(System.in);

    public static int[] getArr() {
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
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static void targetSum(int[] arr, int num) {
        int count = 0;
        System.out.println("Total Triplet Pairs of Target Sum :: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == num) {
                        System.out.println("( " + arr[i] + " , " + arr[j] + " , " + arr[k] + " )");
                        count++;
                    }
                }
            }
        }
        System.out.println("Total No. of Triplet Pairs = " + count);
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.print("\nEnter Targeted Number : ");
        int num = Sc.nextInt();
        targetSum(arr, num);
    }
}
