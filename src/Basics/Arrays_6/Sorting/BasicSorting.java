package Basics.Arrays_6.Sorting;

import java.util.Scanner;

public class BasicSorting {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
// 5 4 3 1 2
    /*
    1st :-
        i = 0 --> 5
            j = 1 --> 4

            if(5 > 4){
                arr[i] = 4;
                arr[j] = 5;
            }

            j = 2 --> 3

            if
    */

    public static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] SelectionSort(int[] arr) {
    /*
        int start = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
//                    min = arr[j];
                      min = j;
                }
            }
            int temp = i;
            i = min;
            arr[i] = arr[min];
            arr[min] = arr[temp];
//            printArr(arr);
//            System.out.println();
        }
        return arr;
      */


        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("\ni = min = " + i);
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("\nj = " + j);
                System.out.println(arr[j] + " < " + arr[min]);
                if (arr[j] < arr[min]) {
                    System.out.println("true");
                    min = j;
                    System.out.println("\nmin = " + min);
//                    System.out.println();
                }

//                printArr(arr);
//                System.out.println();
                System.out.println();
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            printArr(arr);
            System.out.println();
//            System.out.println();
        }
        return arr;
    }

    // 2 1 5 4 3
    /*
        i = 0 --> 2
        temp = 2
            j = 0 ; j >= 0
            if(1>1) X
    // 2 1 5 4 3
        i = 1 --> 1
        temp = 1 ;

    */
    /*
    public static int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("At i = " + i);
            int temp = arr[i];
            for (int j = i; j >= 0; j--) {
                System.out.println("At j = " + j);
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                }
                if(temp < arr[j]){}
                arr[j] = temp;
                printArr(arr);
                System.out.println();
            }
            System.out.println();
        }
        return arr;
   }
     */
    public static int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("At i = " + i);
            int curr = arr[i];
            System.out.println("Curr = " + curr);
            int prev = i - 1;
            System.out.println("Prev = " + prev);
            while (prev >= 0 && arr[prev] > curr) {
                System.out.println("\nif " + arr[prev] + " > " + curr);
                arr[prev + 1] = arr[prev];
                System.out.println("arr[" + (prev + 1) + "] = " + arr[prev]);
//                System.out.println("At prev = " + arr[prev]);
                prev--;
                printArr(arr);
                System.out.println("\n");
            }
            arr[prev + 1] = curr;
            System.out.println("arr[" + (prev + 1) + "] = " + curr);
            System.out.println("\n");
            printArr(arr);
            System.out.println("\n\n");
            /*
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > curr) {
                    arr[j + 1] = arr[j];
                }
            }
            */
//            printArr(arr);
//            System.out.println();
        }
        return arr;
    }


    public static void main(String[] args) {
//        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
        int[] arr = {5, 4, 1, 3, 2};
        printArr(arr);
        System.out.println("\n : ");
//        printArr(BubbleSort(arr));
//        printArr(SelectionSort(arr));
        printArr(InsertionSort(arr));
    }
}
