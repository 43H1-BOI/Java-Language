package Basics.String_7;

import java.util.*;

public class stringBuilder {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        System.out.println("Entered String is :: " + str);

        StringBuilder StrBui = new StringBuilder(Sc.nextLine());
        System.out.println("Entered String in StringBuilder is : "+StrBui);

        StrBui.setCharAt(0,'w');
        System.out.println(StrBui);


    }
}
