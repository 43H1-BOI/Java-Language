package Core_Java.ExceptionHandling;

public class Exception_try_catch {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);

        // now num divided by zero
        // System.out.println(num / 0);
        // the above line will give exception, and we need to handle it

        try {
            System.out.println(num / 0);
            System.out.println("Divide By Zero Done");
        } catch (ArithmeticException e) {
            System.out.println("Divided By Zero Error !");
        } finally {
            System.out.println("Program Ended Successfully");
        }
    }
}