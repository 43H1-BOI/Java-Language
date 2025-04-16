package Basics.Functions_8;

// Sum of N Num Using Recursion
public class Recu_SumOfN {
    public static int Sum(int num) {
        if (num == 1) {
            return 1;
        }
        int res = num + Sum(num - 1);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Sum of "+3+" natural numbers are :: ");
        System.out.println(Sum(3));
    }
}
