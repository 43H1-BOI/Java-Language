package Basics.Conditional_4;

import java.util.*;

//To Calculate income tax paid by an Employee
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Income (in Lakhs) :");
        float income = Sc.nextFloat();
        if (income <= 2.5) {
            System.out.println("You Don't Have to Pay Any Tax.");
        } else if ((income >= 2.5) && (income <= 5.0)) {
            System.out.println("You are under 5% tax slab.");
        } else if ((income >= 5.0) && (income <= 10.0)) {
            System.out.println("You are under 20% tax slab.");
        } else {
            System.out.println("You are under 30% tax slab.");
        }

        /*
        //int choice;
        //choice = 1;
        //choice = 2;
        //choice = 3;
        //choice = 4;

        switch (choice) {
            case 1:
                System.out.println("You Don't Have to Pay Any Tax.");
                break;
            case 2:
                System.out.println("You are under 5% tax slab.");
                break;
            case 3:
                System.out.println("You are under 20% tax slab.");
                break;
            case 4:
                System.out.println("You are under 30% tax slab.");
                break;
        }
        */
    }
}
