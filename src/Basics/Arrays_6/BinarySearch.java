package Basics.Arrays_6;

import java.util.Scanner;

import static java.util.Arrays.stream;

public class BinarySearch {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static void sort(int arr[]) {
        System.out.println("Sorting Array ...");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array Sorted Successfully ! ");

//        System.out.println("Array is Already Sorted ! ");
        printArr(arr);
    }

    public static int Binary(int arr[], int num) {
//        System.out.println("Performing Binary Search ...");
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return (mid + 1);
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid - 1;
            }
        }
        return -1;
    }
    /*
size =


     */

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = Sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Elements in Array :: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = Sc.nextInt();
        }
        sort(arr);
        System.out.print("Enter Num to Find : ");
        int num = Sc.nextInt();
        System.out.print("Num is at Position : ");
        System.out.println(Binary(arr, num));
    }
}

