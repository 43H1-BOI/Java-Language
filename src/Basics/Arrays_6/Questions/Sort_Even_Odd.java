package Basics.Arrays_6.Questions;

import java.util.Scanner;

// Sort Even Elements to Left and Odd Elements to Right
public class Sort_Even_Odd {
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

    public static int[] sort_E_O(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = (n - 1);

        while (left < right) {
            // Left = Odd           Right = Even
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
            // Left = Even
            if (arr[left] % 2 == 0) {
                left++;
            }
            // Right = Odd
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
//        printArr(arr);
//        System.out.println("\n : ");
        printArr(sort_E_O(arr));
    }
}
