package Basics.Patterns_3;

import java.util.Scanner;

public class Pattern_2_cpy {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = num; i > 0; i--) {
            char ch = 'A';
            for (int j = (num - i); j < num; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.print("\n");
        }
        /*
            Pattern :-
                A B C D E
                A B C D
                A B C
                A B
                A
        */
    }
}
