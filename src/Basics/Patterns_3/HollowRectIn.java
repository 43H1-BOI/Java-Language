package Basics.Patterns_3;

import java.util.Scanner;

// Incomplete
public class HollowRectIn {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int length = Sc.nextInt();
        int height = Sc.nextInt();

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == (height - 1)) {
                for (int j = 0; j < length; j++) {// Top and Bottom of Rectangle
                    System.out.print(" * ");
                }
                System.out.println();
            }

            { // Borders of Rectangle
                for (int k = 0; k < length; k++) {
                    if (k == 0 || k == (length - 1)) {
                        System.out.print(" * ");
                    } else System.out.print("   ");
                }
                System.out.println();
            }


        }
    }
}
