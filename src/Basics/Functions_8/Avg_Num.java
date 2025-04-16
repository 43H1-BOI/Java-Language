package Basics.Functions_8;

public class Avg_Num {

    static double average(double... a) {
        //Average Of 'n' numbers
        int n = a.length;
        double sumOfNumbers = 0;

        //Claculating sum of numbers
        for (double i : a) {
            sumOfNumbers = sumOfNumbers + i;
        }
        return (sumOfNumbers / n);
    }

    public static void main(String[] args) {
        System.out.println(average(10, 20, 30, 40, 50));   //prints average of 5 numbers

        System.out.println(average(10, 20, 30, 40, 50, 60, 70, 80));  //prints average of 8 numbers

        System.out.println(average(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110));  //prints average of 11 numbers
    }
}