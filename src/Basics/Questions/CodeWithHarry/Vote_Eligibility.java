package Basics.Questions.CodeWithHarry;
import java.util.Scanner;
//Write a function that takes in age as input and returns if that person is
//eligible to vote or not. A person of age > 18 is eligible to vote.
public class Vote_Eligibility {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Check Eligibility For Vote ");
        System.out.print("Enter Your Age : ");
        int age = Sc.nextInt();
        if (age >= 18) {
            System.out.println("Vote Do!!");
        } else System.out.println("Rehne Do");
    }
}
