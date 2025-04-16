package Basics.Arrays_6.Questions;

import java.util.Scanner;

// Sorting array having only 0's and 1's

public class Sorting_01 {
    static Scanner Sc = new Scanner(System.in);

    public static byte[] getArr() {
        System.out.print("Enter Size of Array : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        byte[] arr = new byte[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = Sc.nextByte();
        }
        return arr;
    }

    public static void printArr(byte[] arr) {
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    // Method 1
    public static byte[] sort01(byte[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                flag++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < flag) {
                arr[i] = 0;
            } else arr[i] = 1;
        }

        return arr;
    }


    // Method 2
    public static byte[] sort01_2(byte[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                byte temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        byte[] arr = getArr();
//        System.out.println("Elements in Array are : ");
//        printArr(arr);
//        System.out.println("\n : ");
        printArr(sort01_2(arr));
    }
}
