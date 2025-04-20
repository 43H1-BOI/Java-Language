package Core_Java.ExceptionHandling;

import java.util.*;
import java.lang.*;

public class Exception_throw {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int num1 = Sc.nextInt();
        int num2 = 0;

        try {
            num2 = num / num1;

            if (num2 == 0) {
                num2 = num;
                throw new ArithmeticException("Value Cannot be Zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error Occurred : " + e.getMessage());
        }

        System.out.println(num2);
    }
}