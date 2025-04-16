package Basics.Arrays_6.Arr_2D;

import java.util.Scanner;

//Incomplete
public class Spiral_Matrix {
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

    public static void spiralMatrix(int[][] mat) {
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length - 1;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Printing Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(mat[startRow][j] + "\t");
            }
            // Printing Right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + "\t");
            }
            // Printing Bottom
            for (int j = endCol; j >= startCol; j--) {
                System.out.print(mat[endRow][j] + "\t");
            }
            // Printing Left
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(mat[i][startCol] + "\t");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int[][] mat = getMat();
        printMat(mat);
        spiralMatrix(mat);
    }
}
