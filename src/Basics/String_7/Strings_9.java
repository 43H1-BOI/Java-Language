package Basics.String_7;

import java.util.*;

public class Strings_9 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // Basics of String (Input-Output,Copy)
        System.out.println("\nStoring in String and Getting Output");
        String greet = "Hello Ji ! Good Morning";
        String greet2 = greet; // Copying String
        System.out.println(greet2);


        //Using next() and nextLine() Functions
        //* nextLine() has Higher Preference So always use it Before any kind of next() Fun
        System.out.println("\nUsing next() and nextLine() Functions :: ");
        System.out.print("Enter Full Name : ");
        String fullN = Sc.nextLine();
        System.out.println("Full Name is " + fullN);
        // This will take Whole String/Sentence as Input

        System.out.print("Enter First Name : ");
        String firstN = Sc.next();
        System.out.println("First Name is " + firstN);
        // This will only take First Word From Input(Anything before space)


        //Using charAt()
        System.out.println("\nUsing charAt() :: ");
        char fNameLetter = fullN.charAt(2);
        // This will return Character at () Index given by us
        System.out.println("Character at Index 2 is " + fNameLetter);

        //Using length()
        System.out.println("\nUsing length() :: ");
        int fNameLength = fullN.length();
        // This will return Character at () Index given by us
        System.out.println("Length of " + fullN + " is " + fNameLength);

        //Using indexOf()
        System.out.println("\nUsing indexOf() :: ");
        System.out.print("Enter Your String :");
        String userStr = Sc.next();
        System.out.println("Your String is " + userStr);
        System.out.print("Enter Character to Find Index of :");
        char userInput = Sc.next().charAt(0);
        int fNameIndex = fullN.indexOf(userInput);
        // This will return Index of Character given by us
        if (fNameIndex == -1) {
            System.out.println(userInput + " is not available in the String :" + userStr + ".");
        } else {
            System.out.println("Character " + userInput + " is at Index = " + fNameIndex);
        }

        // Using compareTo()
        System.out.println("\nUsing compareTo() :: ");
        String str = "Hello Ji";
        String gtr = "Hello Ji";
        int res = str.compareTo(gtr);
        // Used to Compare two Strings
        System.out.println("Result of Comparison : " + res);
        /*
            Result will be as Follows ::
            0 if there is no difference in between
            +ve if 1st One is Greater than 2nd One
            -ve if 2nd One is Greater than 1st One

            Here 1st = str ( Calling Member )
            & 2nd = gtr ( Passed as Argument)
         */

        System.out.println("Getting +ve Result : ");
        String str1 = "Jello Ji";
        String gtr1 = "Hello Ji";
        int res1 = str1.compareTo(gtr1);
        System.out.println("Result of Comparison : " + res1);
        // This will Return +ve 2 b'coz str1 is 2 greater than gtr1
        // b'coz J comes after H ( have 2 letter difference )

        System.out.println("Getting -ve Result : ");
        String str2 = "Hello Ji";
        String gtr2 = "Jello Ji";
        int res2 = str2.compareTo(gtr2);
        System.out.println("Result of Comparison : " + res2);
        // This will Return -ve 2 b'coz str2 is 2 lesser than gtr2
        // b'coz J comes after H ( have 2 letter difference )

    }
}
