package Basics.Questions;
/*
Take the principal amount, rate of interest,
and the time period as input and calculate the Simple Interest.
Note: Return answer as Floor integer value
*/

import java.util.* ;

class P3_C1_CN {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Calculate Simple Interest :: ");
        System.out.print("Enter Principal Amount : ");
        int principal = Sc.nextInt();
        System.out.print("Enter Rate of Interest : ");
        float rate = Sc.nextFloat();
        System.out.print("Enter Time Period : ");
        int time = Sc.nextInt();

        System.out.print("Simple Interest = ");
        int SI = (int)(principal*rate*time)/100;
        System.out.print(SI);
    }
}

