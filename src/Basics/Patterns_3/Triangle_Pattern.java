package Basics.Patterns_3;

public class Triangle_Pattern {
    public static void main(String args[]) {
        int n = 5;
        int i, j, num = 1;
        for (i = 1; i <= n; i += 2) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}