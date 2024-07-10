package Practice.OperatorsAnd_2;

public class BitWise_Operator {
    public static void main(String[] args) {
        // Bitwise Operators

        System.out.println("Bitwise Operators");
        System.out.println();
        System.out.println("AND & Operator : ");
        System.out.print(" 5 & 6 : ");
        System.out.println(5 & 6);
        /*
            AND Operator
            if any one bit is 0 then resulting bit will also be 0
            OR
            if both the bits are 1 only then resulting bit will be 1.

            EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 0 1 0 0 --> 4
        */
        System.out.println();
        System.out.println("OR | Operator : ");
        System.out.print(" 5 | 6 : ");
        System.out.println(5 | 6);
        /*
            OR Operator
            if any one bit is 1 then resulting bit will also be 1.
            OR
            if both the bits are 0 only then resulting bit will be 0.

            EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 0 1 1 1 --> 7
        */

        System.out.println("XOR ^ Operator : ");
        System.out.print(" 5 ^ 6 : ");
        System.out.println(5 ^ 6);
        /*
        XOR Operator
        if any both bits are Different then resulting bit will be 1.
        OR
        if both the bits are Same only then resulting bit will be 0.

        EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 0 0 1 1 --> 3
                */

        /*
        System.out.println("XOR ^ Operator : ");
        System.out.print(" 5 ^ 6 : ");
        System.out.println(5 ^ 6);

            XOR Operator
            if any both bits are Different then resulting bit will be 0.
            OR
            if both the bits are Same only then resulting bit will be 1.

            EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 1 1 0 0 --> 12
        */


    }

}
