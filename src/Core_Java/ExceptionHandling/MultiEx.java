package Core_Java.ExceptionHandling;

import java.util.*;

public class MultiEx {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = Sc.nextInt();  // InputMismatchException
            System.out.println("You entered: " + number);

            int result = 100 / number;  // ArithmeticException if number = 0
            System.out.println("100 divided by your number is: " + result);

            int[] array = {10, 20, 30};
            System.out.print("Enter array index (0-2): ");
            int index = Sc.nextInt();  // InputMismatchException again
            System.out.println("Value at index " + index + " is: " + array[index]);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a valid index between 0 and 2.");
        }

        System.out.println("Program ended safely.");
        Sc.close();
    }
}
