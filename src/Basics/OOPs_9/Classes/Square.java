package Basics.OOPs_9.Classes;

import java.util.Scanner;

public class Square {
    static Scanner Sc = new Scanner(System.in);
    private static int side;

    public static void setSide() {
        System.out.print("Enter Side of Square : ");
        side = Sc.nextInt();
    }

    public static int Area() {
        return (side * side);
    }

    public static int Perimeter() {
        return (4 * side);
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square();

        System.out.print("Enter Number of Squares : ");
        int Sq = Sc.nextInt();

        for (int i = 1; i <= Sq; i++) {
            Square S = new Square();
            System.out.println("\nEnter Detail of Square " + i + " : ");
            S.setSide();
            System.out.println("Area of Square " + i + " = " + S.Area());
            System.out.println("Perimeter of Square " + i + " = " + S.Perimeter());
        }
//        s1.setSide();
//        System.out.println("Area of 1st Square = "+s1.Area());
//        System.out.println("Perimeter of 1st Square = "+s1.Perimeter());
//
//        s2.setSide();
//        System.out.println("Area of 2nd Square = "+s2.Area());
//        System.out.println("Perimeter of 2nd Square = "+s2.Perimeter());

    }
}
