package Games;

import java.util.Scanner;

public class TicTakToe {
    static Scanner Sc = new Scanner(System.in);

    // To Count No of Moves
    static int count = 0;

    // Stores Information related Players
    static players pO = players.O, pX = players.X;

    // To Store Board
    static players[][] Board = new players[3][3];

    static {
        // To Initialize Board
        Board[0][0] = players.U;
        Board[0][1] = players.U;
        Board[0][2] = players.U;
        Board[1][0] = players.U;
        Board[1][1] = players.U;
        Board[1][2] = players.U;
        Board[2][0] = players.U;
        Board[2][1] = players.U;
        Board[2][2] = players.U;
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
        System.out.println(" " + Board[0][0] + " │ " + Board[0][1] + " │ " + Board[0][2] + " ");
        System.out.println("———¦———¦———");
        System.out.println(" " + Board[1][0] + " │ " + Board[1][1] + " │ " + Board[1][2] + " ");
        System.out.println("———¦———¦———");
        System.out.println(" " + Board[2][0] + " │ " + Board[2][1] + " │ " + Board[2][2] + " ");
    }

    // Checks the Winner
    static players whoWins() {
        // True == O Wins
        // False == X Wins
        if (Board[0][0] == Board[0][1] && Board[0][1] == Board[0][2]) {
            if (Board[0][0] == players.O) return players.O;
            else return players.X;
        } else if (Board[1][0] == Board[1][1] && Board[1][1] == Board[1][2]) {
            if (Board[1][0] == players.O) return players.O;
            else return players.X;
        } else if (Board[2][0] == Board[2][1] && Board[2][1] == Board[2][2]) {
            if (Board[2][0] == players.O) return players.O;
            else return players.X;
        } else if (Board[0][0] == Board[1][0] && Board[1][0] == Board[2][0]) {
            if (Board[0][0] == players.O) return players.O;
            else return players.X;
        } else if (Board[0][1] == Board[1][1] && Board[1][1] == Board[2][1]) {
            if (Board[0][1] == players.O) return players.O;
            else return players.X;
        } else if (Board[0][2] == Board[1][2] && Board[1][2] == Board[2][2]) {
            if (Board[0][2] == players.O) return players.O;
            else return players.X;
        } else if (Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2]) {
            if (Board[0][0] == players.O) return players.O;
            else return players.X;
        } else if (Board[2][0] == Board[1][1] && Board[1][1] == Board[0][2]) {
            if (Board[2][0] == players.O) return players.O;
            else return players.X;
        } else return null;
    }

    // To Make Moves
    static void makeMove(players P, int cord1, int cord2) {
        // cord1 and cord2 must be in range 0 <= x <= 2
        if (isValidMove(cord1, cord2) && Board[cord1][cord2] == null) {
            // This Means the Co-ords contains Temporary Player or No move is made previously on that place
            Board[cord1 - 1][cord2 - 1] = P;
            count++;
        } else {
            System.out.println("Please Enter Valid Coordinates .");
        }
    }

    // main Function
    public static void main(String[] args) {
        System.out.println("TicTacToe Game : ");
        System.out.println("Player 1 --> X");
        System.out.println("Player 2 --> O");
        System.out.println("Empty Block --> U");

        do {
            displayBoard();
            playerMove(pO, 1);

            // To Check if moves > 5 (base-case) then if win then return
            if (count >= 5) {
                players winner = whoWins();
                if (winner == players.X) {
                    System.out.println("Player X wins the Game");
                    return;
                } else if (winner == players.O) {
                    System.out.println("Player O wins the Game");
                    return;
                }
            }

            displayBoard();
            playerMove(pX, 2);
        } while (count < 9);
    }

    static void playerMove(players P, int pNum) {
        int cord1, cord2;

        System.out.print("Player " + pNum + " Move :");
        cord1 = Sc.nextInt();
        cord2 = Sc.nextInt();
        makeMove(P, cord1, cord2);
    }

    // To Have Players
    enum players {
        //U , // Unknown Player
        X, // Player X
        O // Player O
    }
}