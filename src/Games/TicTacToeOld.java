package Games;

import java.util.Scanner;

public class TicTacToeOld {
    // For Input
    static Scanner Sc = new Scanner(System.in);

    // Stores Successful Moves of game
    static players[][] SuccessMoves = new players[3][3];

    /*
    // Initialized all Members as U {Temporary Number}
    static {
        SuccessMoves[0][0] = players.U;
        SuccessMoves[0][1] = players.U;
        SuccessMoves[0][2] = players.U;
        SuccessMoves[1][0] = players.U;
        SuccessMoves[1][1] = players.U;
        SuccessMoves[1][2] = players.U;
        SuccessMoves[2][0] = players.U;
        SuccessMoves[2][1] = players.U;
        SuccessMoves[2][2] = players.U;

//         Below Code Not Working
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                SuccessMoves[i][j] = players.U;
//            }
//        }
//
    }
   */
    // Stores player 1 and player 2 info
    static players p1, p2;

    static {
        SuccessMoves[0][0] = players.U;
        SuccessMoves[0][1] = players.U;
        SuccessMoves[0][2] = players.U;
        SuccessMoves[1][0] = players.U;
        SuccessMoves[1][1] = players.U;
        SuccessMoves[1][2] = players.U;
        SuccessMoves[2][0] = players.U;
        SuccessMoves[2][1] = players.U;
        SuccessMoves[2][2] = players.U;
    }

    static void Board(players[][] SuccessMoves, int cord1, int cord2) {
        // cord1 and cord2 must be in range 0 <= x <= 2
        if (cord1 <= 2 && cord1 >= 0 && cord2 <= 2 && cord2 >= 0) {
            // why doing this don't know
            cord1--;
            cord2--;
            if (SuccessMoves[cord1][cord2] == players.U) {
                // This Means the Co-ords contains Temporary Player or
                // No move is made previously on that place
                SuccessMoves[cord1][cord2] = p1;
            } else {
                System.out.println("Invalid Move");
            }

        /*
        The below one is Systematic Form of Above Board
        System.out.println(" 1,1 │ 1,2 │ 1,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 2,1 │ 2,2 │ 2,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 3,1 │ 3,2 │ 3,3 ");
        */

            System.out.println(" " + SuccessMoves[0][0] + " │ " + SuccessMoves[0][1] + " │ " + SuccessMoves[0][2] + " ");
            System.out.println("—————¦—————¦—————");
            System.out.println(" " + SuccessMoves[1][0] + " │ " + SuccessMoves[1][1] + " │ " + SuccessMoves[1][2] + " ");
            System.out.println("—————¦—————¦—————");
            System.out.println(" " + SuccessMoves[2][0] + " │ " + SuccessMoves[2][1] + " │ " + SuccessMoves[2][2] + " ");


        /*
        // Typical X O Board
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");
        */
        } else {
            System.out.println("Please Enter Valid Coordinates .");
        }
    }

    // Winning Boards
    /*
        // Board 1
        System.out.println(" X  │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │ X  │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │ X ");

        // Board 2
        System.out.println("    │    │ X ");
        System.out.println("————¦————¦————");
        System.out.println("    │ X  │   ");
        System.out.println("————¦————¦————");
        System.out.println(" X  │    │   ");

        // Board 3
        System.out.println(" X  │    │   ");
        System.out.println("————¦————¦————");
        System.out.println(" X  │    │   ");
        System.out.println("————¦————¦————");
        System.out.println(" X  │    │   ");

        // Board 4
        System.out.println("    │ X  │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │ X  │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │ X  │   ");

        // Board 5
        System.out.println("    │    │ X ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │ X ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │ X ");

        // Board 6
        System.out.println(" X  │ X  │ X ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");

        // Board 7
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println(" X  │ X  │ X ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");

        // Board 8
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println(" X  │ X  │ X ");

    */

    public static void main(String[] args) {
        System.out.println("Tic Tac Toe Game : \n\n");
        int choice;

        // For Selection of Player
        do {
            System.out.println("Enter 1 To Select X.");
            System.out.println("Enter 2 To Select 0.");
            System.out.println("Enter 3 To Exit Game.\n");

            System.out.println("Select Your Choice :");
            choice = Sc.nextInt();
            switch (choice) {
                case 1: {
                    p1 = players.X;
                    System.out.println("You Selected X.");
                    p2 = players.O;
                    break;
                }
                case 2: {
                    p1 = players.O;
                    System.out.println("You Selected O.");
                    p2 = players.X;
                    break;
                }
                case 3: {
                    System.out.println("Thanks For Playing ;)");
                    System.out.println("Exiting Program .");
                    return;
                }
                default: {
                    System.out.println("Invalid Choice !");
                    System.out.println("Please Select From Given Options : ");
                }
            }
            if (choice == 1 || choice == 2) break;
        } while (choice != 3);

        System.out.println("Let's Go Buddy !\n");

        // SuccessMoves counts the Successful Moves Entered by Player
        // If He/She Enters the coordinates where one player is already present then it will not be counted as successful move
        // SuccessMoves Array Contains the GameBoard

        // Now this
//        players[][] SuccessMoves = new players[3][3];
//        int[][] Moves = new int[3][3];

        System.out.println(" 1,1 │ 1,2 │ 1,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 2,1 │ 2,2 │ 2,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 3,1 │ 3,2 │ 3,3 ");

        do {
            System.out.println("Enter Your Move in Given Coordinate Form :  ");
            int cord1 = Sc.nextInt();
            int cord2 = Sc.nextInt();
            Board(SuccessMoves, cord1, cord2);
        } while (true);
        // Will put Winning Boards Inside While()


    }

    // Contains Players
    enum players {
        U, // Unknown Player
        X, // Player X
        O // Player O
    }

}