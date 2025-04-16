package Practice.ExceptionHandling;// Multiple catch clauses

import java.util.*;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a=" + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Box:" + e);
        }
        System.out.println("After try/catch blocks");
    }
}