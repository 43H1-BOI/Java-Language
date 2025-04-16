package Basics.String_7;

// Reversing String in 2 Different Ways
public class RevString {
    public static void main(String[] args) {

        System.out.println("Reversing String in 2 Different Ways\n");

        String og = new String("Abhishek");

        // Method 1 : Using charAt() Fun and for loop
        System.out.println("\nReversing String Using Method 1");
        System.out.println("\nIn This Method We create an empty string and will use for Loop (or any Loop) and then \nusing loop each character is placed before new string that we created before ");
        String revS = "";// Created Empty String
        for (int i = 0; i < og.length(); i++) {
            revS = og.charAt(i) + revS;
            // inserting characters in Reverse Order inside string
        }
        System.out.println("Original String : " + og);
        System.out.println("Reversed String : " + revS);


        // Method 2 : Using StringBuilder's reverse() method
        System.out.println("\n\nReversing String Using Method 2");
        System.out.println("\nIn This Method We create an StringBuilder object and will use append() method to copy \noriginal String to StringBuilder and then use reverse() method to Reverse the String");
        StringBuilder revStr = new StringBuilder();// Created StringBuilder's Object
        revStr.append(og);// Copying Original String to revStr using append() method
        revStr.reverse(); // Reversing String using reverse() method
        System.out.println("Original String : " + og);
        System.out.println("Reversed String : " + revStr);

    }
}


