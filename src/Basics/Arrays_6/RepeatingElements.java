package Basics.Arrays_6;

import java.util.Scanner;

public class RepeatingElements {

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

    public static int lastRepeating(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
//        printArr(arr);
        System.out.println("Program to Find Last Duplicate Element in an Array : ");

        int lastRep = lastRepeating(arr);
        if (lastRep == Integer.MIN_VALUE) {
            System.out.println("No Duplicate Element Found !!");
        } else {
            System.out.print("Duplicate Element from Last : ");
            System.out.println(lastRep);
        }

        int firstRep = firstRepeating(arr);
        if (firstRep == Integer.MIN_VALUE) {
            System.out.println("No Duplicate Element Found !!");
        } else {
            System.out.print("Duplicate Element from Beginning : ");
            System.out.println(firstRep);
        }

    }
}