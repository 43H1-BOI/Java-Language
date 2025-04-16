package Basics.Questions.CodingNinja;

import java.util.*;
//Largest Element in the Array

public class P1_C3_CN {

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Program to Find Largest Element in an Array :: ");
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in Array :: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Element "+ (i+1) +" : "+arr[i]);
        }

        System.out.println("Largest Element of Array is "+largestElement(arr, n));

    }
}

