package Basics.Functions_8;

import java.util.Scanner;
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233
public class Recu_Fibb {
    public static int Fibb(int n) {
        if (n == 0) {
            return 0;
        } else if ( n == 1 || n == 2){
            return 1;
        }
        return Fibb(n - 1) + Fibb(n - 2);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        System.out.println(Fibb(num));
    }
}
