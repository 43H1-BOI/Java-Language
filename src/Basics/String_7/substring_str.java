package Basics.String_7;

//Input s = "abcd"
//Output a ab abc abcd b bc bcd c cd d
public class substring_str {
    public static void main(String[] args) {
        String s = "abcd";
        /*
        System.out.print(s.substring(0, 1));
        System.out.print(" " + s.substring(0, 2));
        System.out.print(" " + s.substring(0, 3));
        System.out.print(" " + s.substring(0));
        System.out.print(" " + s.substring(1, 2));
        System.out.print(" " + s.substring(1, 3));
        System.out.print(" " + s.substring(1));
        System.out.print(" " + s.substring(2, 3));
        System.out.print(" " + s.substring(2));
        System.out.print(" " + s.substring(3));
        */
        for (int i = 0; i <= 3 ; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.print(s.substring(i, j) + " ");
            }
        }
        // Exception Index Out Of Bound
//        substring(i,j) --> gives substring from index i to (j-1)
//        substring(i); --> gives substring from index i to end of string
    }
}
