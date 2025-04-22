package Basics.Arrays_6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_ArrayList {
    static Scanner Sc = new Scanner(System.in);
/*
    public static ArrayList getArrLi() {
        System.out.print("Enter Size of ArrayList : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        ArrayList arr = new ArrayList();
        for (int i = 0; i < x; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr.add(Sc.next());
        }
        return arr;
    }

    public static void printArrLi(ArrayList arr) {
        System.out.println(arr);
    }
 */
    /*
    public static ArrayList reverseArrLi(ArrayList arr) {
        int i = 0, j = arr.size() - 1;
        while(i<j){
            Integer temp = (Integer) arr.get(i);
            //Integer.valueOf(i) , Integer.valueOf(j)
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        return arr;

    }
     */


    public static void main(String[] args) {
        System.out.print("Enter Size of ArrayList : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");

        ArrayList arr = new ArrayList(x);
        for (int i = 0; i < x; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr.add(Sc.nextInt());
        }

        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
