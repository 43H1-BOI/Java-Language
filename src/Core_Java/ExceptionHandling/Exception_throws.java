package Core_Java.ExceptionHandling;

public class Exception_throws {
    public static void main(String[] args) {
        table(12);
        try {
            divisor(36);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    static void table(int num) throws ArithmeticException {
        int i = 1;
        while (i != 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }

    static void divisor(int num) throws ArithmeticException {
        int i = 100;
        System.out.println("Divisor of " + num + " = ");
        while (i != 0) {
            if (num % i == 0)
                System.out.print(i + " ");

            i--;
        }
        throw new ArithmeticException("0 is not Divisor of Any Number");
    }
}

// Used to throw exception from functions and that exception is being handled in its upper class ( function calling that )