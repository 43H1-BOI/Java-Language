package Basics.Functions_8;

import java.util.Scanner;

public class BinomialCoefficient {
    public static long Fact(int n) {
        long fact = n;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long Bino(int n, int r) {
        long fact = Fact(n);
        long rFact = Fact(r);
        long nrFact = Fact((n - r));
        long binoCoeff = (fact / (rFact * nrFact));
        return binoCoeff;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Find Binomial Coefficient : ");

        System.out.print("Enter Value of n : ");
        int n = Sc.nextInt();

        System.out.print("Enter Value of r : ");
        int r = Sc.nextInt();

        System.out.print("Binomial Coefficient = " + Bino(n, r));
    }
}
/*
Formula :-
Binomial Coefficient
nCr = n!/(r!*(n-r)!)
 */