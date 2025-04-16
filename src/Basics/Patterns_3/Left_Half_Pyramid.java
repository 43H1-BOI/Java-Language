package Basics.Patterns_3;

public class Left_Half_Pyramid {
    public static void main(String args[]) {
        int n = 5;
        int i, j, num = 1;

        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= n - i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
}