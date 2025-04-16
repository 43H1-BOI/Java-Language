package Basics.Patterns_3;

import java.util.Scanner;

public class Pattern_3_cpy {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.print("\n");
        }
        /*
            Pattern ::
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
        */
    }
}
