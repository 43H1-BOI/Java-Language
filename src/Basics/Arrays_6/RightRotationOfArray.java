package Basics.Arrays_6;

import java.util.Scanner;

public class RightRotationOfArray {
    static Scanner Sc = new Scanner(System.in);

    public static int[] getArr() {
//        Scanner Sc = new Scanner(System.in);
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
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] rotateRight(int[] arr) {
        int[] rotatedArr = new int[arr.length];
        System.out.println("Enter a Number to Rotate the Array to Right : ");
        int n = Sc.nextInt();
        int i = 0;
        for (int j = n; i < arr.length; j++) {
            if (j == arr.length) {
                j = 0;
            }
            rotatedArr[j] = arr[i];
            i++;
        }
        return rotatedArr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);
        printArr(rotateRight(arr));

    }
}
/*
arr
1 2 3 4 5
0 1 2 3 4  -> Index

rotatedArr(3)
3 4 5 1 2
0 1 2 3 4  -> Index
2 3 4 0 1  -> Old Index
*/