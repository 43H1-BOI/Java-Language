package Basics.Arrays_6;

import java.util.Scanner;

public class NumberOfElementsGreaterThanGivenNumber {
    // To FInd Number of Elements Strictly Greater than a Given Number
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

    public static void GreaterThanGiven(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\nTotal Number of Elements Strictly Greater Than " + x + " = " + count);
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\nProgram to Find Strictly Greater Element : ");
        System.out.print("Enter the Number to Perform the above task with  : ");
        int x = Sc.nextInt();
        GreaterThanGiven(arr, x);
    }
}
