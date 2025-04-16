package Basics.Questions.CodeWithHarry;

//Incomplete

import java.util.*;

/*
Input :-
    This is my Text
Output :-
    This
    is
    my
    Text
*/
public class Formatting_To_UpperCase {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // String str = Sc.nextLine();
        String str = new String("This is my Text");
        str = str.replaceAll(" ", "\n");
        System.out.println(str);
    }
}

/*

this is my name
This Is My Name
    Logic :-
    For Every Time we get a Space We'll Get it's Index and then
    make the Character next to it as Capital letter
*/
/*
public class Formatting_To_UpperCase {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        for (int i=0 ; i < str.length() ; ){
            int indexOf = str.indexOf(" ");
            str = str.replace((indexOf+1),);

        }

    }
}
*/