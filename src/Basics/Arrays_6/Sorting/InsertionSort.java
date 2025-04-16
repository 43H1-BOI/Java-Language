package Basics.Arrays_6.Sorting;

import java.util.Scanner;

public class InsertionSort {
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

    public static int[] Insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
//            System.out.println("At i = " + i);
            int curr = arr[i];
//            System.out.println("Curr = " + curr);
            int prev = i - 1;
//            System.out.println("Prev = " + prev);
            while (prev >= 0 && arr[prev] > curr) {
//                System.out.println("");
                arr[prev + 1] = arr[prev];
//                System.out.println("arr[" + (prev + 1) + " = " + arr[prev]);
//                System.out.println("At prev = " + arr[prev]);
                prev--;
            }
            arr[prev + 1] = curr;
            /*
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > curr) {
                    arr[j + 1] = arr[j];
                }
            }
            */
//            printArr(arr);
//            System.out.println();
        }
        return arr;
    }
}

/*
Insertion Sort -->
We'll Put a element from Unsorted Array and then put it inside Sorted Array

*/