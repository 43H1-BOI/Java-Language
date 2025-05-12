package Games;

import java.util.Scanner;

public class TicTacToe {
    static Scanner Sc = new Scanner(System.in);

    // Checks for Winner
    static boolean hasWinner = false;

    // To Count No of Moves
    static int count = 0;

    // Stores Information related Players
    static players pO = players.O, pX = players.X;

    // To Store Board { all values = null }
    static players[][] Board = new players[3][3];

    // To Validate Move
    static boolean isValidMove(int cord1, int cord2) {
        return (cord1 >= 1 && cord1 <= 3) && (cord2 >= 1 && cord2 <= 3);
    }

    // To Print Winner
    static void printWinner(players winner) {
        if (count == 9) {
            System.out.println("Game Draw");
        } else if (winner == players.X) {
            System.out.println("Player X wins the Game");
        } else if (winner == players.O) {
            System.out.println("Player O wins the Game");
        }
    }

    // To Display Board
    static void displayBoard() {
        /*
        The below one is Systematic Form of Above Board
        System.out.println(" 0,0 │ 0,1 │ 0,2 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 1,0 │ 1,1 │ 1,2 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 2,0 │ 2,1 │ 2,2 ");
        */
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Board[i][j] == null) {
                    System.out.print(" " + (i + 1) + "," + (j + 1) + " ");
                } else {
                    System.out.print("  " + Board[i][j] + "  ");
                }
                if (j < 2) System.out.print("│");
            }
            System.out.println("\n—————¦—————¦—————");
        }
        System.out.println();
//
//        System.out.println(" " + Board[0][0] + " │ " + Board[0][1] + " │ " + Board[0][2] + " ");
//        System.out.println("———¦———¦———");
//        System.out.println(" " + Board[1][0] + " │ " + Board[1][1] + " │ " + Board[1][2] + " ");
//        System.out.println("———¦———¦———");
//        System.out.println(" " + Board[2][0] + " │ " + Board[2][1] + " │ " + Board[2][2] + " ");
    }

    // Checks the Winner
    static players whoWins() {
        // Rows
        for (int i = 0; i < 3; i++) {
            if (Board[i][0] != null &&
                    Board[i][0] == Board[i][1] &&
                    Board[i][1] == Board[i][2]) {
                hasWinner = true;
                return Board[i][0];
            }
        }

        // Columns
        for (int i = 0; i < 3; i++) {
            if (Board[0][i] != null &&
                    Board[0][i] == Board[1][i] &&
                    Board[1][i] == Board[2][i]) {
                hasWinner = true;
                return Board[0][i];
            }
        }

        //Diagonal 1
        if (Board[0][0] != null &&
                Board[0][0] == Board[1][1] &&
                Board[1][1] == Board[2][2]) {
            hasWinner = true;
            return Board[0][0];
        }

        // Diagonal 2
        if (Board[0][2] != null &&
                Board[0][2] == Board[1][1] &&
                Board[1][1] == Board[2][0]) {
            hasWinner = true;
            return Board[0][2];
        }

        // No Winner
        return null;
    }

    // main Function
    public static void main(String[] args) {
        System.out.println("TicTacToe Game : ");
        System.out.println("Player 1 --> X");
        System.out.println("Player 2 --> O");
//        System.out.println("Empty Block --> U");

        do {
            displayBoard();
            playerMove(pO, 1);

            // To Check if moves > 5 (base-case) then if win then return
            players winner = whoWins();
            if (count >= 5 && hasWinner) {
                displayBoard();
                printWinner(winner);
                return;
            }

            displayBoard();
            playerMove(pX, 2);
        } while (count < 9 && !hasWinner);
    }

    // To Perform Player Move
    static void playerMove(players P, int pNum) {
        int cord1, cord2;

        System.out.print("Player " + pNum + " Move :");
        cord1 = Sc.nextInt();
        cord2 = Sc.nextInt();

        if (isValidMove(cord1, cord2) && Board[cord1 - 1][cord2 - 1] == null) {
            // This Means the Co-ords contains Temporary Player or No move is made previously on that place
            Board[cord1 - 1][cord2 - 1] = P;
            count++;
        } else {
            System.out.println("Invalid Move");
            System.out.println("Please Enter Valid Coordinates Again.");
            playerMove(P, pNum);
        }
    }

    // To Have Players
    enum players {
        //U , // Unknown Player
        X, // Player X
        O // Player O
    }
}