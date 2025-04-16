package Leetcode;

public class FirstOccurrenceinString_28 {

/*
28. Find the Index of the First Occurrence in a String - Easy

Description :
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.

Example 2:
    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:
    1 <= haystack.length, needle.length <= 104
    haystack and needle consist of only lowercase English characters.
*/

    static int strStr(String s1, String s2) {
        final int m1 = s1.length();
        final int m2 = s2.length();

        for (int i = 0; i < m1 - m2 + 1; i++) {
            if (s1.substring(i, i + m2).equals(s2)) {
                // lets break down this
                // 1 . we know if we got the string then it be of size s2.length()
                // 2 . then we checks if the string is equals to s2 string
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("28. Find the Index of the First Occurrence in a String");

        System.out.println(strStr("abcuvwxyz", "xyz"));
    }
}
