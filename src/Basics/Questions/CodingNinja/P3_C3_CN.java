package Basics.Questions.CodingNinja;
/*

You have been given an array ‘a’ of ‘n’ non-negative integers.
You have to check whether the given array is sorted in the
non-decreasing order or not.
Incomplete
 */


import java.util.*;

public class P3_C3_CN {

    public static boolean isSorted(int n, int[] a) {
        int sort = a[0];
        for (int i = 1; i < n; i++) {
            if (sort <= a[i]) {
                sort = a[i];
            } else return false;
        }
        return true;
    }

    public static void main(String[] agrs) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program To Check Whether array is Sorted or Not /nIf not then Sort It :: ");
        System.out.print("Enter Size of Array : ");
        int n = Sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[0] = Sc.nextInt();
        }
        if (!(isSorted(n, arr))) {
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + " = ");
                System.out.println(arr[i]);
            }
        }

    }
}

