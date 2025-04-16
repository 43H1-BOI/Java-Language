package Basics.Questions.CodeWithHarry;
import java.util.*;

public class Replace_Characters {
    public static void main(String[] args){
        System.out.println("Program to Replace Space' ' with Underscore'_'");
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        System.out.println("Entered String is : "+ str);
        String newStr = str.replace(' ','_');
        System.out.println("New String is : "+ newStr);
    }
}
