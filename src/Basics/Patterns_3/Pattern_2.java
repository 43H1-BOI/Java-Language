package Basics.Patterns_3;

import java.util.*;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = (num-i); j < num; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        /*
            Pattern :-
                * * * *
                * * *
                * *
                *

        */
    }
}
