import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = new char[3][3];

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // ===== UC2: Toss Logic =====
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        char player1Symbol, player2Symbol;
        int currentPlayer;

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println("Player " + currentPlayer + " starts first");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);

        // ===== Display Board (UC1) =====
        System.out.println("\nTic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}