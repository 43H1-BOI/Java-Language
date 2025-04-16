package Basics.Arrays_6;

import java.util.*;

//Incomplete
public class StockMarket_In {
    static Scanner Sc = new Scanner(System.in);
    static Random random = new Random();


    public static void Stocks(int days) {
        int[] arr = new int[days];
        int buyingP = Integer.MAX_VALUE;
        int sellingP = Integer.MIN_VALUE;
//        int buyingD = 1;
//        int sellingD = 2;
        for (int i = 0; i < days; i++) {
            arr[i] = random.nextInt(1, 100);
            System.out.println("Day " + (i + 1) + " : " + arr[i]);
//        if (buyingD <= sellingD) {
            if (arr[i] < buyingP) {
                buyingP = arr[i];
//              buyingD = (i + 1);
            } else if (arr[i] > sellingP) {
                sellingP = arr[i];
//              sellingD = (i + 1);
            }
//        }
        }
        System.out.println("Best Buying Price of a Stock : Rs." + buyingP);
        System.out.println("Best Selling Price of a Stock : Rs." + sellingP);
//        System.out.println("Total Profit from a Stock : Rs." + Profit);
/*
System.out.println("Day " + buyingD + " is the Best for Buying a Stock at Price of Rs." + buyingP);
System.out.println("Day " + sellingD + " is the Best for Selling a Stock at Price of Rs." + sellingP);
*/
    }

    public static void main(String[] args) {
        Stocks(9);
    }
}
