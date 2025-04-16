package Basics.Arrays_6;

import java.util.Scanner;

// Maximum Sum of SubPairs of Array
public class SubPair_PQ {
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
        System.out.println();
        return arr;
    }

    public static void printArr(int[] arr) {
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }


    public static int SubP(int[] arr) {
        int maxSum = arr[0];
//        int temp=0;
        for (int i = 0; i < arr.length; i++) { //i = start
            int currSum = 0;
            for (int j = i; j < arr.length; j++) { // j = end
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    System.out.print(arr[k] + " ");
                    if (currSum >= maxSum) {
                        maxSum = currSum;
//                        temp=arr[i];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
//        System.out.print(temp);
        System.out.print("Maximum Sum of Pairs of SubArrays are : ");
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(SubP(arr));
    }
}
