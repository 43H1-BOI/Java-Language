package Basics.Questions.CodeWithHarry;
//Incomplete
import java.util.*;

public class MultipleSpaces {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        if(str.matches(" {2}")){
//            str.contentEquals("  ")
            System.out.println("Contains more than 1 Spaces");
        } else {
            System.out.println("Does Not Contains more than 1 Spaces");
        }
    }
}
