package Basics.Questions.CodingNinja;
import java.util.Scanner;
//Write a program to find x to the power n (i.e., x^n). Take x and n from the user.
public class P5_C2_CN {
    public static int Power(int num,int pow){
        int square = 1;
        if (pow == 0) return square;

        for (int i = 1 ; i <= pow ; i ++){
            square *= num;
        }
        return square;
    }
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Find Power of Any Number :: ");
        System.out.print("Enter Number : ");
        int num = Sc.nextInt();
        System.out.print("Enter Power : ");
        int pow = Sc.nextInt();
        System.out.print(num +" raised to the power "+ pow +" = "+Power(num,pow));
    }
}
