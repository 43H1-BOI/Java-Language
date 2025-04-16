package Basics.Arrays_6;

import java.util.Scanner;

// For a given array of integers of size n, answer q queries to print
// the sum of values in a given range of indices from l to r

// This Program uses 1 based Indexing means Index of Array Starts from 1(For us)
// We'll Read and Write Elements from 1 index to n index(length of array + 1)
public class SumGivenInRange {
    static Scanner Sc = new Scanner(System.in);

    public static int[] getArr() {
        System.out.print("Enter Size of Array : ");
        int x = Sc.nextInt();
        x += 1;
        System.out.println("Enter Elements in Array :: ");
        int[] arr = new int[x];
        for (int i = 1; i < x; i++) {
            System.out.print("Element " + i + " : ");
            arr[i] = Sc.nextInt();
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        // System.out.println("Elements in Array Are :: ");
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //        System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);

        System.out.print("\nEnter No. of Testcase : ");
        int t = Sc.nextInt();

        while (t-- > 0) {
            System.out.print("Enter Starting Index : ");
            int l = Sc.nextInt();
            System.out.print("Enter Ending Index : ");
            int r = Sc.nextInt();
            int sum = 0;

            for (int i = l; i <= r; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of Elements from " + l + " to " + r + " = " + sum);
        }
    }
}
