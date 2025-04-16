package Practice.ExceptionHandling;


// Print Stack trace Function Implementation
public class printStTrace {
    public static void main(String[] args) {
        int num = 9;
        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Error !");
            e.printStackTrace();
        } finally {
            System.out.println("Program Ended Successfully !");
        }
    }
}