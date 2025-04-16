package Basics.Arrays_6.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayUsingFun {
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
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = getArr();
        Arrays.sort(arr);

        System.out.println("Array Before Sorting :: ");
        printArr(arr);

        System.out.println("Array After Sorting :: ");
        printArr(arr);


    }
}
