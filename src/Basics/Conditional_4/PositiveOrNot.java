package Basics.Conditional_4;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        if(num >= 0){
            System.out.println("Number is Positive");
        } else System.out.println("Number is Negative");
    }
}
