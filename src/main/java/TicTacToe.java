import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // UC3
    public static int getUserSlot(Scanner scanner) {
        System.out.print("Enter slot (1-9): ");
        return scanner.nextInt();
    }

    // UC4
    public static int[] getRowCol(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // UC5
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        // UC1: Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // UC2: Toss
        Random random = new Random();
        int currentPlayer = (random.nextInt(2) == 0) ? 1 : 2;
        char player1Symbol = 'X';
        char player2Symbol = 'O';

        System.out.println("Player " + currentPlayer + " starts");

        // UC3
        int slot = getUserSlot(scanner);

        // UC4
        int[] pos = getRowCol(slot);
        int row = pos[0];
        int col = pos[1];

        // UC5
        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }

        // Display board (UC1)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}