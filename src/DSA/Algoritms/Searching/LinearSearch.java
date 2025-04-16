package DSA.Algoritms.Searching;

import java.util.Scanner;

public class LinearSearch {
    static Scanner Sc = new Scanner(System.in);

    public static int[] getArr() {
        System.out.print("Enter Size of Array : ");
        int size = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        int[] arr = new int[size];
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

    public static int linearSearch(int[] arr, int find) { //returns index of find element

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }

        // if not found then returns -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);

        System.out.println("Enter Element to find in the Array : ");
        int find = Sc.nextInt();

        int idx = linearSearch(arr, find);
        if (idx == -1) {
            System.out.println("Element not found in Array !");
        } else {
            System.out.println("Element found at " + (idx + 1) + " position");
        }
    }
}
