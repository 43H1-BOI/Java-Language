package Randoms;

import java.util.*;

public class CopyArray {
    public static int[] DupArr(int[] arr) {
        int[] DupArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            DupArr[i] = arr[i];
        }
        return DupArr;
    }



    public static int[] getArr() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element "+ (i+1)+" : ");
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

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements Entered in Array are :: ");
        printArr(arr);

        System.out.println("Elements in Duplicate Array are :: ");
        int[] Duplicate = DupArr(arr);
        printArr(Duplicate);
    }
}
