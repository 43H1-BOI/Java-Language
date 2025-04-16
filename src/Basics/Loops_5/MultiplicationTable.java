package Basics.Loops_5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Find Multiplication table :: ");
        System.out.print("Enter Number :: ");
        int num = Sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num +" x " + i + " = " + (num*i));
        }
    }
}
