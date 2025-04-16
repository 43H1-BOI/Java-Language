package Basics.Conditional_4;

import java.util.*;

public class DayCounter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Count of Day : ");
        int count = Sc.nextInt();

        System.out.print("Day :: ");
        if (count % 7 == 1) {
            System.out.println("Monday");
        } else if (count % 7 == 2) {
            System.out.println("Tuesday");
        } else if (count % 7 == 3) {
            System.out.println("Wednesday");
        } else if (count % 7 == 4) {
            System.out.println("Thursday");
        } else if (count % 7 == 5) {
            System.out.println("Friday");
        } else if (count % 7 == 6) {
            System.out.println("Saturday");
        } else if (count % 7 == 0) {
            System.out.println("Sunday");
        }
    }
}
