package Basics.Arrays_6.Sorting;

import java.util.Scanner;

public class SelectionSort {
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

    public static int[] Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\n : ");
        printArr(Selection(arr));
    }
}
/*
Selection Sort Algorithm :-
    Push small element at beginning of the array.

arr = 5 2 3 1 4
//min = Infi;
for (int i = 0; i < arr.length; i++) {
    int min = -Infi;
    for(int j = i+1 ; j < arr.length ; j++){
        if(arr[j] < min){
            int temp = min;
            min = arr[j];
            arr[i] = arr[j];
            arr[j] = temp;
         }
    }
}


/////////////////////////////////////////////

for (int i = 0; i < arr.length; i++) {
    int min = i;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < min) {
            min = j;
        }
    }
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
}







*/