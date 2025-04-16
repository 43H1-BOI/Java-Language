package Randoms;
// Incomplete
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int rem;
        int res = 0;
        int ogNum = num;

        while (ogNum != 0) {
            // remainder contains the last digit
            rem = ogNum % 10;

            res += rem * rem * rem;

            // removing last digit from the original number
            ogNum /= 10;
        }
        if (res == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is an not an Armstrong number.");
    }
}
/*
Armstrong Number ::
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
153 is armstrong num
*/
