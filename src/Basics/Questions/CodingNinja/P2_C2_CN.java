package Basics.Questions.CodingNinja;

import java.util.*;

//import static java.lang.Math.max;

/*
 Write a program that takes three numbers a,b, and c
 as input and prints the largest number amongst them.
*/
class P2_C2_CN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(Math.max(num1, Math.max(num2, num3)));
    }
}
/*

class P2_C2_CN {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}

class P2_C2_CN {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        if (a >= b) {
            if (a >= c) System.out.print(a);
            else System.out.print(c);
        } else if (b >= c) {
            if (c >= a) System.out.print(c);
            else System.out.print(b);
        }
    }
}
*/
