package Basics.Arrays_6;

import java.util.Scanner;

public class MaxMinArray {
    public static int[] getArr() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element "+ (i+1)+" : ");
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

    public static int Max(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if( arr[i] > maxElement ){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static int Min(int[] arr) {
        int minElement = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if( arr[i] < minElement ){
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);
        System.out.println("Max Element = " + Max(arr));
        System.out.println("Min Element = " + Min(arr));

    }
}
