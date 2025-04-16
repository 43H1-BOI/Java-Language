package DSA.Algoritms.Searching;

import java.util.Scanner;

public class BinarySearch {
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
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static int binarySearch(int[] arr, int find) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == find) {
                return mid;
            } else if (arr[mid] > find) {
                end = mid - 1;
            } else if (arr[mid] < find) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearchRec(int[] arr, int find, int start, int end) {
        if (start > end) {
            return -1;
        }
        int idx = -1;
        int mid = (start + end) / 2;

        if (arr[mid] == find) {
            return mid;
        } else if (arr[mid] > find) {
            idx = binarySearchRec(arr, find, start, mid - 1);
        } else if (arr[mid] < find) {
            idx = binarySearchRec(arr, find, mid + 1, end);
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);

        System.out.println("Enter Element to find in the Array : ");
        int find = Sc.nextInt();

        int idx = binarySearch(arr, find);
        if (idx == -1) {
            System.out.println("Element not found in Array !");
        } else {
            System.out.println("Element found at " + (idx + 1) + " position");
        }
    }

}