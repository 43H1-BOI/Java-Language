package Basics.Questions.CodingNinja;

import java.util.Scanner;
public class P3_C2_CN {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Find Sum of N Even Terms :: ");
        System.out.print("Enter a Number : ");
        int n = Sc.nextInt();
        int ans = 0;
        for (int i = 0 ; i <= n ; i+=2 ){
            ans += i ;
        }
        System.out.print("Sum of N Even Terms = "+ans);
    }
}
