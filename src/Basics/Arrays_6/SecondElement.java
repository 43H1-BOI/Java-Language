
package Basics.Arrays_6;

import java.util.Scanner;

public class SecondElement {
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

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    } // To Get Largest Element

    public static int SecMax(int[] arr) {
        int max = Max(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return Max(arr);
    } // To Get 2nd Largest Element

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    } // To Get Smallest Element

    public static int secMin(int[] arr) {
        int min = Min(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        return Min(arr);
    } // To Get 2nd Smallest Element

    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);


        int min = Min(arr);
        int min_2 = secMin(arr);

        int max = Max(arr);
        int max_2 = SecMax(arr);

        System.out.print("Largest Element : ");
        System.out.println(max);
        System.out.print("Second Largest Element : ");
        System.out.println(max_2);

        System.out.println();

        System.out.print("Smallest Element : ");
        System.out.println(min);
        System.out.print("Second Smallest Element : ");
        System.out.println(min_2);
    }
}