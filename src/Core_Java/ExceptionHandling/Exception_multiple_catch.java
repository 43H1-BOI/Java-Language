package Core_Java.ExceptionHandling;

import java.util.Scanner;

public class Exception_multiple_catch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int size = Sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;
//        for (int i : arr) {
//            System.out.println(i);
//        }

        try {
            for (int i = 0; i <= size; i++) {
                System.out.println("Enter Element " + i + " : ");
                arr[i] = Sc.nextInt();
                sum += arr[i];
            }

            if (sum == 0) {
                throw new ArithmeticException("All Elements of Array Cannot be Zero.");
            }
        }
        // this is multiple exceptions handling using | (or) operator
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Exception Occurred : " + e.getMessage());
        }

        /*
        // this is multiple catch
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */

        // Both have different use case
    }
}
