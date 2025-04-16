package Basics.Arrays_6;

import java.util.Scanner;

//Program to check if an array can be partitioned into sub-arrays with equal sum
public class PartitionSum {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //        System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static boolean partitionSum(int[] arr) {
        boolean cond = false; //kinda flag
        int part = 1; // partition is starting from 1st index b'coz common sense
        int n = arr.length; // length of array
        int pSum, sSum; // prefix Sum & suffix Sum


        while (part < n) { // partition < size of array
            pSum = 0;
            sSum = 0;
            int j = 0; // pSum Variable

            // pSum must run till partition index (-1)
            while (j < part) {
                pSum += arr[j];
                j++;
            } // Prefix Sum Found
            System.out.println("Prefix Sum = " + pSum);

            // sSum must starts from partition index to end of array
            int i = part; // temp variable for sSUm
            while (i < n) {
                sSum += arr[i];
                i++;
            } // Suffix Sum Found
            System.out.println("Suffix Sum = " + sSum);

            // This Condition will be Checked only once to save our resources
            if (part == 1) {
                // This Condition means if Partition Sum Exists for any array then
                // it will not follow below condition
                float avg = (float) ((pSum + sSum) % 2);
                if (avg != 0) {
                    System.out.println("Sorry Mitr");
                    return cond;
                }
                // This Condition just says if partition sum exists then sum of pSum and sSum must be an even number
            }


            // This Checks if Partition Sum found then will return true
            if (pSum == sSum) {
                cond = true;
                System.out.println("Index of Partition = " + part);
                return cond;
            }

            part++; // Partition Index Moved 1 Step Forward if No Partition Sum Found
        }

        return cond; // means no partition found
    }

    public static void partSum2(int[] arr) {
        int totalSum = totalSum(arr);
        int part = 1;

        while (part < arr.length) {
            int preSum = 0;
            for (int i = part; i >= 0; i--) {
                preSum += arr[i];
            }

            int suffSum = totalSum - preSum;

            // This Condition will be Checked only once to save our resources
            if (part == 1) {
                // This Condition means if Partition Sum Exists for any array then
                // it will not follow below condition
                int avg = (preSum + suffSum) % 2;
                if (avg != 0) {
                    System.out.println("Sorry Mitr !! ");
                    break;
                }
                // This Condition just says if partition sum exists then sum of preSum and suffSum must be an even number
            }


            if (preSum == suffSum) {
                System.out.println("Partition Sum Found !!");
                System.out.println("Partition Index = " + part);
                break;
            }
            part++;
        }
//        System.out.println("No Partition Sum Found !!");

    }

    // Most Efficient Method (I think)
    public static void partSum3(int[] arr) {
        int[] preSum = prefixSum(arr);
        int totalSum = totalSum(arr);

        for (int i = 1; i < arr.length; i++) {
            int suffSum = totalSum - preSum[i];

            // This Condition will be Checked only once to save our resources
            if (i == 1) {
                // This Condition means if Partition Sum Exists for any array then
                // it will not follow below condition
                int avg = (preSum[i] + suffSum) % 2;
                if (avg != 0) {
                    System.out.println("No Prefix Sum Found !");
                    break;
                }
                // This Condition just says if partition sum exists then sum of preSum[i] and suffSum must be an even number
            }


            if (preSum[i] == suffSum) {
                System.out.println("Partition Sum Found :)");
                System.out.println("Partition Index = " + i);
                break;
            }
        }
    }

    private static int totalSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        return prefix;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{5, 3, 2, 6, 3, 1};
        System.out.println("Ex . { 5 , 3 , 2 , 6 , 3 , 1 }");
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);

        System.out.println("\n1st Method");
        System.out.println(partitionSum(arr));

        System.out.println("\n2nd Method");
        partSum2(arr);

        System.out.println("\n3nd Method");
        partSum3(arr);

    }
}
