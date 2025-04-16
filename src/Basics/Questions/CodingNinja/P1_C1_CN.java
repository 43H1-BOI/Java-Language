package Basics.Questions;
import java.util.Scanner;
//Take the length(L) and breadth(B) of the rectangle as input and find its area

public class P1_C1_CN {
        public static void main(String args[]) {
            Scanner Sc = new Scanner(System.in);
            int length , breadth ;
            System.out.println("Program to Find Area of Rectangle :: ");
            System.out.print("Enter Length of Rectangle : ");
            length = Sc.nextInt();
            System.out.print("Enter Breadth of Rectangle : ");
            breadth = Sc.nextInt();

            System.out.print("Area of Rectangle : ");
            int area = (length * breadth);
            System.out.print(area);

        }
    }