package Basics.Arrays_6.Questions;

import java.util.Scanner;

public class DSA_TrappingWater_IN {
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

    // 4 2 0 6 3 2 5
    // 0 2 4 0 2 3 0
//    int[] arr
    public static int[] trappedWater() {
        int[] arr = new int[]{4, 2, 0, 6, 3, 2, 5};
        int maxH = arr[0];
        int[] tWater = new int[arr.length];
        tWater[0] = 0;
        tWater[(arr.length - 1)] = 0;
        for (int i = 1; i < (arr.length - 1); i++) {
            if (maxH < arr[i]) {
                maxH = arr[i];
                tWater[i] = 0;
            } else if (maxH > arr[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > maxH) {
//                        maxH = arr[j];
                        tWater[i] = maxH - arr[i];
                        break;
                    } else if (arr[j] < maxH) {
                        tWater[i] = 0;
                    }
                }
            } else tWater[i] = (arr[i] - maxH);
        }
        return tWater;
    }

    public static void main(String[] args) {
//        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
//        printArr(arr);
//        System.out.println("\n : ");
        printArr(trappedWater());
    }
}
