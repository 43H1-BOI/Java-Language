package Basics.Arrays_6;

import java.util.Scanner;

public class SecondSmallest {

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

    public static int Min(int[] arr) {
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static int secondSmall(int[] arr) {
        int min = Min(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        return Min(arr);
    }

    public static void main(String[] args) {
        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
//        printArr(arr);
        System.out.println("\n : ");
        int small = Min(arr);
        int secSmall = secondSmall(arr);

        System.out.println(small);
        System.out.println(secSmall);
    }

}
