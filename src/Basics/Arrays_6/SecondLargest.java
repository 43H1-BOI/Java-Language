package Basics.Arrays_6;

import java.util.Scanner;

public class SecondLargest {
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

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int SecMax(int[] arr) {
        int max = max(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return max(arr);
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);
        int max = max(arr);
        int max_2 = SecMax(arr);

        System.out.println(max);
        System.out.println(max_2);

    }
}
