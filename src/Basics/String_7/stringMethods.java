package Basics.String_7;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Abhishek Yadav";

        System.out.println(name);


        //To Get Length of String
        System.out.println("\nTo Get Length of String :- \nname.length()");
        int Length = name.length();
        System.out.println(Length);


        //To Convert String into Lower Case
        System.out.println("\nTo Convert String into Lower Case :- \nname.toLowerCase()");
        String LowerCase = name.toLowerCase();
        System.out.println(LowerCase);


        //To Convert String into Upper Case
        System.out.println("\nTo Convert String into Upper Case :- \nname.toUpperCase()");
        String UpperCase = name.toUpperCase();
        System.out.println(UpperCase);


        // To Remove Extra Spaces From Start and End of String
        System.out.println("\nTo Remove Extra Spaces From Start and End of String :- \nname.trim()");
        String Trimmed = name.trim();
        System.out.println(Trimmed);


        // To Print SubString from Given Index
        System.out.println("\nTo Print SubString from Given Index :- \nname.substring(3)");
        String subStringBeg = name.substring(3);
        System.out.println(subStringBeg);


        // To Print SubString from Beginning Index to Ending Index
        System.out.println("\nTo Print SubString from Beginning Index to Ending Index :- \nname.substring(3,8)");
        String subStringEnd = name.substring(3, 8);
        System.out.println(subStringEnd);


        // To Replace the Elements and Return a new String
        System.out.println("\nTo Replace the Elements and Return a new String :- \nname.replace('A','B')");
        String subStringReplace = name.replace('A', 'B');
        System.out.println(subStringReplace);


        // To Check Weather a String Starts with Given char or Not
        System.out.println("\nTo Check Weather a String Starts with Given char or Not :- \nname.startsWith(\"Ab\")");
        boolean subStringStartsWith = name.startsWith("Ab");
        System.out.println(subStringStartsWith);


        // To Check Weather a String Ends with Given char or Not
        System.out.println("\nTo Check Weather a String Ends with Given char or Not :- \nname.endsWith(\"av\")");
        boolean subStringEndsWith = name.endsWith("av");
        System.out.println(subStringEndsWith);


        // To Get the Element from Given Index
        System.out.println("\nTo Get the Element From Given Index :- \nname.charAt(0)");
        char StringCharAt = name.charAt(0);
        System.out.println(StringCharAt);


        // To Get Index of Specific Character from The String
        System.out.println("\nTo Get Index of Specific Character from The String :- \nname.indexOf('a')");
        int StringIndexOf = name.indexOf('a');
        System.out.println(StringIndexOf);
        // If  Char is not Present then it returns -1


        // To Get Index of Specific Character from The String
        System.out.println("\nTo Get Index of Specific Character from the given Index in the String :- \nname.indexOf('a',3)");
        int StringFromIndexOf = name.indexOf('a', 3);
        System.out.println(StringFromIndexOf);


        // To Get Index of Last Char in the String
        System.out.println("\nTo Get Index of Last Specific Character in the String :- \nname.lastIndexOf('a')");
        int IndexOfLastCh = name.lastIndexOf('a');
        System.out.println(IndexOfLastCh);


        // To Get Index of any Char from given Last Index
        System.out.println("\nTo Get Index of Last Specific Character Before the Given Index in the String :- \nname.lastIndexOf('a')");
        int StringFromLastIndex = name.lastIndexOf('a', 11);
        System.out.println(StringFromLastIndex);


        // To Perform concat() Method
        String first = "Abhi";
        String last = "Yadav";
        String fullName = first.concat(last);
        System.out.println(fullName);


    }
}
