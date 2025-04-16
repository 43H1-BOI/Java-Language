package Basics.OOPs_9.Abstraction.Interface;

import java.util.*;

public class InterfaceEx_2 {

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Queen Q = new Queen();
        Q.Power();
        Q.moves();
        System.out.println();

        Rook R = new Rook();
        R.Power();
        R.moves();
        System.out.println();

        Bishop B = new Bishop();
        B.Power();
        B.moves();
        System.out.println();

        Knight k = new Knight();
        k.Power();
        k.moves();
        System.out.println();

        King K = new King();
        K.Power();
        K.moves();
        System.out.println();

        Pawn P = new Pawn();
        P.Power();
        P.moves();

    }

    interface ChessMoves {
        void moves();

        void Power();
    }

    static class Queen implements ChessMoves {
        public void moves() {
            System.out.println("Moves : Up , Down , Left , Right , Diagonal - ( 1 - 8 Steps in any Direction)");
        }

        public void Power() {
            System.out.println("The Queen is the most powerful piece on the chess board\n" +
                    "Queen Holds 9 Piece Value");
        }

    }

    static class King implements ChessMoves {
        public void moves() {
            System.out.println("Moves : Up , Down , Left , Right , Diagonal - ( 1 Step in any Direction)");
        }

        public void Power() {
            System.out.println("The King is the most weak player with the least possible moves.\n" +
                    "Slightly King is more powerful than 3 pawns");
        }
    }

    static class Bishop implements ChessMoves {
        public void moves() {
            System.out.println("Moves : Diagonal - ( 1 - 8 Steps in any Direction)");
        }

        public void Power() {
            System.out.println("Bishop can easily influence both Wings simultaneously.\n" +
                    "Bishop Holds 3 Piece Value");
        }
    }

    static class Rook implements ChessMoves {
        public void moves() {
            System.out.println("Moves : Up , Down , Left , Right - ( 1 - 8 Steps in any Direction)");
        }

        public void Power() {
            System.out.println("Rook is Second most powerful piece (behind the queen).\n" +
                    "Rook Holds 5 Piece Value");
        }
    }

    static class Knight implements ChessMoves {
        public void moves() {
            System.out.println("Moves : Up , Down , Left , Right , Diagonal - ( 2.5 Step in any Direction)");
        }

        public void Power() {
            System.out.println("Knights are Strongest in the center of the board, Where they have up to 8 moves, " +
                    "and Weakest in a corner, Where they have only 2.\n" +
                    "Knight Holds 3 Piece Value");
        }

    }

    static class Pawn implements ChessMoves {
        public void moves() {
            System.out.println("Moves : Up , Diagonal ( When have to Kill any piece ) - ( 1 Step in any Direction)");
        }

        public void Power() {
            System.out.println("Pawn is least Powerful Piece.\n" +
                    "Pawn Holds 1 Piece Value");
        }

    }

}