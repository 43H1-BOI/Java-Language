package Basics.Arrays_6.Arr_2D;

import java.util.Scanner;

public class FindElement_Matrix {
    static Scanner Sc = new Scanner(System.in);

    public static int[][] getMat() {
        System.out.println("Creating a Matrix ...");
        System.out.print("Enter No. of Rows : ");
        int row = Sc.nextInt();
        System.out.print("Enter No. of Columns : ");
        int column = Sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Element (" + (i + 1) + " , " + (j + 1) + ") : ");
                arr[i][j] = Sc.nextInt();
            }
        }
        return arr;
    }

    public static void printMat(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                //                System.out.print("Element (" + (i + 1) + " , " + (j + 1) + ") : ");
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean findEle(int[][] mat, int key) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (key == mat[i][j]) {
                    System.out.println("Element is Present in the Matrix at [" + i + " , " + j + "].");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = getMat();
        printMat(mat);
        System.out.print("Enter Element to Search for in the Entered Matrix : ");
        int key = Sc.nextInt();
        findEle(mat, key);

    }
}
