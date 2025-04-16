package Basics.OOPs_9.Polymorphism.Compile_Time;

import java.util.Scanner;

public class Method_Overloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

   /*
   Method Overloading :-
   When there are multiple functions with the same name but different parameters
   then these functions are said to be overloaded. Functions can be overloaded by
   changes in the number of arguments or/and a change in the type of arguments.


   If a class has multiple methods having same name but different in parameters,
   it is known as Method Overloading.

   In Java, Method Overloading is not possible by changing the return type of the method only.
   */

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // Having 2 Int parameter
        System.out.println("Sum = " + sum(5, 5));
        // Having 2 Float parameter
        System.out.println("Sum = " + sum(5.5F, 5.3F));
        // Having 3 int parameter
        System.out.println("Sum = " + sum(5, 4, 2));

    }
}
