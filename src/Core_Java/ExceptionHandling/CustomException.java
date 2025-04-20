package Core_Java.ExceptionHandling;

import java.util.Scanner;

class MineException extends Exception {
    public MineException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int i = Sc.nextInt();
        int j = Sc.nextInt();

        try {
            i *= j;
            if (i == 0) {
                throw new MineException("Value Can't Be Zero");
            }
        } catch (MineException e) {
            System.out.println(e.getMessage());
        }
    }
}
