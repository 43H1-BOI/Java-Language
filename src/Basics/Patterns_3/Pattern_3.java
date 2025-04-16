package Basics.Patterns_3;

import java.util.*;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        /*
            Pattern ::
            *
            * *
            * * *
            * * * *
            * * * * *
        */
    }
}
