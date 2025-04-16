package Basics;

import java.util.Scanner;

public class SuffixSum {
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
        for (int j : arr) {
            System.out.print(j + " ");
            //        System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static int[] suffixSum(int[] arr) {
        int[] suffix = new int[arr.length];
        int n = arr.length - 1;
        suffix[n] = arr[n];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = arr[i] + suffix[n + 1];
        }
        return suffix;
    }


    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\n : ");
        printArr(suffixSum(arr));
    }
}
