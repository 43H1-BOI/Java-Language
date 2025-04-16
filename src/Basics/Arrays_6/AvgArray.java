package Basics.Arrays_6;

import java.util.*;

public class AvgArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++){
            arr[i] = Sc.nextInt();
            sum += arr[i];
        }
        int avg = sum/num;
        System.out.println(avg);

    }
}
