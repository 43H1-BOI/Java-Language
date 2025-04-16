package Basics.Arrays_6.Arr_2D;

import java.util.*;
import java.lang.*;

public class BasicMatrix {
    static Scanner Sc = new Scanner(System.in);


    public static int[][] getMat() {
        System.out.println("\nCreating a Matrix ...");
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
        System.out.println();
    }

    public static int[][] Addition(int[][] mat1, int[][] mat2) {
        if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
            int r = mat1.length;
            int c = mat1[0].length;
            int[][] sum = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sum[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            return sum;
        } else {
            System.out.println("Addition not Possible");
            return new int[0][];
        }
    }

    public static int[][] Subtraction(int[][] mat1, int[][] mat2) {
        if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
            int r = mat1.length;
            int c = mat1[0].length;
            int[][] sub = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sub[i][j] = mat1[i][j] - mat2[i][j];
                }
            }
            return sub;
        } else {
            System.out.println("Subtraction not Possible");
            return new int[0][];
        }
    }

    public static int[][] Multiplication(int[][] mat1, int[][] mat2) {
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int r2 = mat2.length;
        int c2 = mat2[0].length;

        if (c1 == r2) {
            int[][] result = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += (mat1[i][k] * mat2[k][j]);
                    }
                }
            }
            return result;

        } else {
            System.out.println("Multiplication not Possible");
            return new int[0][];
        }
    }

    public static int[][] Transpose(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = mat[j][i];
            }
        }
        return transpose;
    }


    public static void main(String[] args) {

        int choice;
        System.out.println("\nProgram to Perform all Basic Tasks of Matrix : ");
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose");
            System.out.println("5. End Program");
            System.out.print("\nChoose From Above Options : ");
            choice = Sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("\nAddition of Matrix\n");

                    int[][] mat1 = getMat();
                    System.out.println("\nElements in Matrix 1 : ");
                    printMat(mat1);
                    int[][] mat2 = getMat();
                    System.out.println("\nElements in Matrix 2 : ");
                    printMat(mat2);

                    System.out.println("Performing Matrix Addition...");
                    System.out.println("Addition of Matrix : ");
                    printMat(Addition(mat1, mat2));
                    break;
                }
                case 2: {
                    System.out.println("\nSubtraction of Matrix\n");

                    int[][] mat1 = getMat();
                    System.out.println("\nElements in Matrix 1 : ");
                    printMat(mat1);
                    int[][] mat2 = getMat();
                    System.out.println("\nElements in Matrix 2 : ");
                    printMat(mat2);

                    System.out.println("Performing Matrix Subtraction...");
                    System.out.println("Subtraction of Matrix : ");
                    printMat(Subtraction(mat1, mat2));
                    break;
                }
                case 3: {
                    System.out.println("\nMultiplication of Matrix\n");

                    int[][] mat1 = getMat();
                    System.out.println("\nElements in Matrix 1 : ");
                    printMat(mat1);
                    int[][] mat2 = getMat();
                    System.out.println("\nElements in Matrix 2 : ");
                    printMat(mat2);

                    System.out.println("Performing Matrix Multiplication...");
                    System.out.println("Multiplication of Matrix : ");
                    printMat(Multiplication(mat1, mat2));
                    break;
                }
                case 4: {
                    System.out.println("\nTranspose of Matrix\n");

                    int[][] mat = getMat();
                    System.out.println("\nElements in Matrix : ");
                    printMat(mat);


                    System.out.println("Transposing Matrix...");
                    System.out.println("Transpose of Matrix : ");
                    printMat(Transpose(mat));
                    break;
                }
                case 5: {
                    System.out.println("Ending Program ");
                }
                default: {
                    System.out.println("\nInvalid Choice !!");
                }
            }
        } while (choice != 5);
        System.out.println("\nProgram Ended Successfully :)");
    }
}