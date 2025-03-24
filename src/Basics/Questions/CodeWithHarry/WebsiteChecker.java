package Basics.Questions.CodeWithHarry;
import java.lang.*;
import java.util.*;

public class WebsiteChecker {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String web = Sc.nextLine();
        if (web.endsWith(".com")){
            System.out.println("Commercial Website");
        } else if (web.endsWith(".in")) {
            System.out.println("Commercial Website");
        } else if (web.endsWith(".org")){
            System.out.println("Organization Website");
        } else {
            System.out.println("Website Type not Found in DataBase");
        }
    }
}
