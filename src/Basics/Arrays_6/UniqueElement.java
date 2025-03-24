package Basics.Arrays_6;

import java.util.Scanner;

public class UniqueElement {
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
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static void uniqueElement(int[] arr) {
        int[] unique = new int[arr.length];
        // Created a array to store all unique elements

        // Now will run a loop to copy elements of original array to the newly created array
        for (int i = 0; i < arr.length; i++) {
            unique[i] = arr[i];
        }

        // Loop Doing all the important Stuff
        for (int i = 0; i < arr.length; i++) {
            if (unique[i] != 0) { // if unique != 0 then this will run another loop
                // unique[i] will become 0 if any of the element duplicate is found previously
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        unique[j] = 0;
                        unique[i] = 0;
                        break;
                        // if any element have duplicate then the og element as well as
                        // the duplicate element will be set as 0 in the array unique
                        // this will prevent us to run the loop again for already duplicate array
                    } else unique[i] = arr[i];
                    // if the above condition is not fulfilled that means the element is unique
                    // to the respected element and will store the value in unique array
                }
            }
        }

        System.out.print("Unique Elements in Array Are : ");
        for (int i = 0; i < arr.length; i++) {
            if (unique[i] != 0) {
                System.out.print(unique[i] + "  ");
            }
        }
    }


    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 5, 2, 1, 3};
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\nProgram to Find Duplicate Element From Array : ");
        uniqueElement(arr);

    }
}
/*
DRY Run
Array  --> 1 2 3 5 2 1 3
unique --> null


Main(){
        int[] unique = new int[arr.length];
        boolean flag = false;
        for (int i = 0; i < arr.length-i; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique[j] = 0;
                    unique[i] = 0;
                    break;
                } else unique[i]=arr[i];
            }
        }
}
1st Iteration

        boolean flag = false;
        for (int i = 0; i < arr.length-i; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[0] == arr[1]) { // (1 == 2) x
                } else unique[0]=arr[0]; // 1
            }
            for (int j = 2; j < arr.length; j++) {
                if (arr[0] == arr[1]) { // (1 == 3) x
                } else unique[0]=arr[0]; // 1
            }
            for (int j = 3; j < arr.length; j++) {
                if (arr[0] == arr[1]) { // (1 == 5) x
                } else unique[0]=arr[0]; // 1
            }
            for (int j = 4; j < arr.length; j++) {
                if (arr[0] == arr[1]) { // (1 == 2) x
                } else unique[0]=arr[0]; // 1
            }
            for (int j = 5; j < arr.length; j++) {
                if (arr[0] == arr[1]) { // (1 == 1)
                    unique[5] = 0;
                    unique[0] = 0;
                    break;
                }
            }
        }

unique --> 0 x x x x 0 x
index  --> 0 1 2 3 4 5 6

array --> 1 2 3 5 2 1 3

2nd Iteration
        int[] unique = new int[arr.length];
        boolean flag = false;
        for (int i = 1; i < arr.length-i; i++) {
            for (int j = 2; j < arr.length; j++) {
                if (arr[1] == arr[2]) { // (2 == 3) x
                } else unique[1]=arr[1]; // 2
            }
            for (int j = 3; j < arr.length; j++) {
                if (arr[1] == arr[3]) { // (2 == 5) x
                } else unique[1]=arr[1]; // 2
            }
            for (int j = 4; j < arr.length; j++) {
                if (arr[1] == arr[4]) { // (2 == 2)
                    unique[4] = 0;
                    unique[1] = 0;
                    break;
                }
            }
        }

unique --> 0 0 x x 0 0 x
index  --> 0 1 2 3 4 5 6

array --> 1 2 3 5 2 1 3

3rd Iteration
        int[] unique = new int[arr.length];
        boolean flag = false;
        for (int i = 0; i < arr.length-i; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique[j] = 0;
                    unique[i] = 0;
                    break;
                } else unique[i]=arr[i];
            }
        }


4th Iteration
        int[] unique = new int[arr.length];
        boolean flag = false;
        for (int i = 0; i < arr.length-i; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique[j] = 0;
                    unique[i] = 0;
                    break;
                } else unique[i]=arr[i];
            }
        }


5th Iteration
        int[] unique = new int[arr.length];
        boolean flag = false;
        for (int i = 0; i < arr.length-i; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique[j] = 0;
                    unique[i] = 0;
                    break;
                } else unique[i]=arr[i];
            }
        }


6th Iteration
        int[] unique = new int[arr.length];
        boolean flag = false;
        for (int i = 0; i < arr.length-i; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique[j] = 0;
                    unique[i] = 0;
                    break;
                } else unique[i]=arr[i];
            }
        }
*/

/* DRY Run of Previously made Logic
         1 2 3 5 2 1 3 --> OG Array
         1st Iteration
         for(i=0){ //1
            bool flag = false;
            for(j=1){
                if (1 == -1) x
                if(1 == 2)x
            }
            for(j=2){
                if (2 == -1) x
                if(1==3)x
            }
            for(j=3){
                if (3 == -1) x
                if(1==5)x
            }
            for(j=4){
                if (4 == -1) x
                if(1==2)x
            }
            for(j=5){
                if (5 == -1) x
                if(1==1){
                    dup = j; == 5
                    flag = true;
                    break;
                }
            }
            if (!flag){
            Sout(arr[i]);
         }

         1 2 3 5 2 1 3 --> OG Array
                  2nd Iteration
         for(i=1){ //2
            bool flag = false;
            for(j=2){
            if x
                if(2 == 3)x
            }
            for(j=3){
                if(2==5)x
            }
            for(j=4){
                if(2==2){
                    flag = true;
                    break;
                }
            }
         }

         1 2 3 5 2 1 3 --> OG Array
                  3rd Iteration
         for(i=2){ //3
            bool flag = false;
            for(j=3){
                if(3==5)x
            }
            for(j=4){
                if(3==2)x
            }
            for(j=5){
            if ( 5 ==5 ) break;
            }
            for(j=6){
                if(3==3){
                    flag = true;
                    break;
                }
            }
         }

         1 2 3 5 2 1 3 --> OG Array
                  4th Iteration
         for(i=3){ //5
            bool flag = false;
            for(j=4){
                if(5==2)x
            }
            for(j=5){
                if(5==1)x
            }
            for(j=6){
                if(5==3)x
            }
         }

         1 2 3 5 2 1 3 --> OG Array
                  5th Iteration
         for(i=4){ //2
            bool flag = false;
            for(j=5){
                if(2==1)x
            }
            for(j=6){
                if(2==3)x
            }
         }

         1 2 3 5 2 1 3 --> OG Array
                  6th Iteration
         for(i=5){ //1
            bool flag = false;
            for(j=6){
                if(1==3)x
            }
         }
      }
      */