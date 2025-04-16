package Leetcode;

import java.util.Arrays;

public class ValidAnagram_242 {

/*
242. Valid Anagram - Easy

Description :
    -> Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

Example 2:
    Input: s = "rat", t = "car"
    Output: false

Constraints:
    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.
*/

    static public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);

        char[] t1 = t.toCharArray();
        Arrays.sort(t1);


//         To Print all sorted elements
//        for(char ch : s1)
//            System.out.print(ch + " ");
//        System.out.println();
//
//        for(char ch : t1)
//            System.out.print(ch + " ");
//        System.out.println();

        return Arrays.equals(s1, t1);
    }

    public static void main(String[] args) {
        System.out.println("28. Find the Index of the First Occurrence in a String");

        System.out.println(isAnagram("hello moto", "motoo hell") ? "Is Valid" : "Not Valid");
    }
}
