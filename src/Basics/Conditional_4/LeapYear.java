package Basics.Conditional_4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int year = Sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else System.out.println("Not a Leap Year");
    }
}
