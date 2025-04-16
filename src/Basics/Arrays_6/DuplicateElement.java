package Basics.Arrays_6;
import java.util.*;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,2,5,6};
        for (int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i]==arr[j]) {
                    System.out.println("Duplicate Element Found");
                    System.out.println(arr[i]+"have Duplicates");
                    break;
                }
            }
        }
        System.out.println("Program Ended !!");
    }
}
