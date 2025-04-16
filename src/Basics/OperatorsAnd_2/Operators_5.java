package Basics.OperatorsAnd_2;

public class Operators_5 {
    public static void main(String[] args){
        int a =  9 ; // Assignment Operator
        int b = 4 ;
        b += 3 ; //  This is Also Assignment Operator
        System.out.println("Value of A = " + a + " And Value of B = " + b);

        // Arithmetic Operator
        System.out.println("Sum of a and b is " + (a+b));

       if ( a == b ) { // Comparison Operator
           System.out.println("Equal");
       } else System.out.println("Not Equal");

       boolean c = true;
       System.out.println(a>b && a==b); // Logical Operator
       System.out.println("Not of True is " + (!c) );

       // Bitwise Operator operates with bits ( &,| )

        // Left Shift << and Right Shift >> Operator
        // It Also Performs Operations on Bits
        System.out.println("Using Left Shift Operator << ");
        System.out.println(9 << 2);
        // This means we want to shift binary form of 9 by 2 position in left
        // 9 --> 1001 :: the answer will be 100100 --> 36
        // Formula :: a << b = a * 2^b

        System.out.println("Using Right Shift Operator >> ");
        System.out.println(10 >> 2);
        // This means we want to shift binary form of 9 by 2 position in right
        // 10 --> 1010 :: the answer will be 0010 --> 2
        // Formula :: a >> b = a / 2^b

    }
}
