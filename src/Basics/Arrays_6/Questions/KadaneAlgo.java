package Basics.Arrays_6.Questions;

import java.util.*;

// If the sum of any two number is negative then this will gives
// zero instead of teh number itself
public class KadaneAlgo {
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

    public static int[] Kadane(int[] arr) {
        int[] kadaneArr = new int[arr.length];
        if (arr[0] > 0) {
            kadaneArr[0] = arr[0];
        } else {
            kadaneArr[0] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            kadaneArr[i] = arr[i] + kadaneArr[i - 1];
            if (kadaneArr[i] < 0) {
                kadaneArr[i] = 0;
            }
        }
        return kadaneArr;
    }

    // Size of Array = 7
    // -2 -1  4  5 -6  -10 -12
    //  0  0  4  9  3   0   0

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\n : ");
        printArr(Kadane(arr));
    }
}