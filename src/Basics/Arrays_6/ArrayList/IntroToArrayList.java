package Basics.Arrays_6.ArrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        // ArrayList Overcomes the Limitations of Array
        // Like : Size of Array is Fixed
        // Declaration
        ArrayList<Integer> arr = new ArrayList<>();

        // Add Item to ArrayList
        System.out.println("\nTo add element at end of the ArrayList, we use add() method ");
        arr.add(1); // will add the number after the ArrayList
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Elements Added Successfully !");

        // to get first element of ArrayList
        System.out.print("\nTo get First Element , we use getFirst() method : ");
        System.out.println(arr.getFirst());

        // To Print Element from given Index
        System.out.print("\nTo get element by its index , we use get() method : ");
        System.out.println(arr.get(1));

        // To get last element of ArrayList
        System.out.print("\nTo get Last Element , we use getLast() method : ");
        System.out.println(arr.getLast());


        // To get length of ArrayList
        System.out.print("\nTo get size of ArrayList , we can use size() method : ");
        System.out.println(arr.size());

        // To Print all elements of ArrayList
        System.out.println("\nTo Print all Elements of ArrayList at Once : ");
        System.out.println(arr);


        // To add Element at Specific Index
        System.out.println("\nTo Add an element at specific index , we use add(index,element) method : ");
        arr.add(0, 1);

        System.out.println("Printing ArrayList after Adding new Element to ArrayList : ");
        System.out.println(arr);


        // To Replace any element from ArrayList
        System.out.println("\nTo Modify any element at given Index , we use set(index,element) method :");
        arr.set(0, 0);

        System.out.println("Printing ArrayList after Modifying Element in ArrayList : ");
        System.out.println(arr);

        // To Remove Element at any Index
        System.out.println("\nTo remove element from given Index , we use remove() method : ");
        arr.remove(0);

        System.out.println("Printing ArrayList after Modifying Element in ArrayList : ");
        System.out.println(arr);


        // To Remove the Given Element
        System.out.println("\nTo remove Specific Element from ArrayList , we use remove(Integer.valueOf()) method : ");
        arr.remove(Integer.valueOf(5));

        System.out.println("Printing ArrayList after Removing Element from ArrayList : ");
        System.out.println(arr);


        // To check if Element Exists
        System.out.println("\nTo Check Whether an element Exists or Not , we use contains() method : ");
        boolean b = arr.contains(1);
//      Or
//      boolean b = arr.contains(Integer.valueOf(1));
        if (b) {
            System.out.println("Element Exists !! ");
        } else System.out.println("Elements Doesn't Exists !! ");


        // If you don't Specify class, you can put anything inside it arr1
        System.out.println("\nUsing Specify Class : ");
        System.out.println("If we don't specify class of ArrayList , then we will put anything inside them");
        ArrayList arr1 = new ArrayList();
        arr1.add("Abhishek");
        arr1.add(69);
        arr1.add(9.45);
        arr1.add('s');
//        arr1.add(new int[]{3, 2});
        System.out.println(arr1);





    }
}
