package Leetcode;

public class RichestCustomerWealth_1672 {
    /*
    1672. Richest Customer Wealth - Easy

    Description :
        -> You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
        -> Return the wealth that the richest customer has.
        -> A customer's wealth is the amount of money they have in all their bank accounts.
        -> The richest customer is the customer that has the maximum wealth.

    Example 1:
        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest with a wealth of 6 each, so return 6.

    Example 2:
        Input: accounts = [[1,5],[7,3],[3,5]]
        Output: 10
        Explanation:
        1st customer has wealth = 6
        2nd customer has wealth = 10
        3rd customer has wealth = 8
        The 2nd customer is the richest with a wealth of 10.

    Example 3:
        Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
        Output: 17

    Constraints:
        m == accounts.length
        n == accounts[i].length
        1 <= m, n <= 50
        1 <= accounts[i][j] <= 100
    */

    public static int maximumWealth(int[][] accounts) {
        int size1 = accounts.length;
        int size2 = accounts[0].length;

        int currMax = 0;
        for (int i = 0; i < size1; i++) {
            int Max = 0;
            for (int j = 0; j < size2; j++) {
                Max += accounts[i][j];
            }
            if (currMax < Max) {
                currMax = Max;
            }
        }
        return currMax;
    }

    public static void main(String[] args) {
        System.out.println("1672. Richest Customer Wealth");

        int[][] Ques = {
                {1, 2, 3},
                {2, 3, 2},
                {0, 1, 1}
        };

        System.out.println("Question vector : ");
        for (int i = 0; i < Ques.length; i++) {
            for (int j = 0; j < Ques[i].length; j++) {
                System.out.print(Ques[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int Ans = maximumWealth(Ques);
        System.out.println("Answer = " + Ans);
    }
}
