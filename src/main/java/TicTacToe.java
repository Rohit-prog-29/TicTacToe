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

    // ===== UC5: Validate Move =====
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Cell empty check
        if (board[row][col] != '-') {
            return false;
        }

        return true;
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
        System.out.println("Player " + currentPlayer + " starts");

        // UC3: Input
        int slot = getUserSlot(scanner);

        // UC4: Convert
        int[] pos = getRowCol(slot);
        int row = pos[0];
        int col = pos[1];

        // ===== UC5: Validate =====
        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move ✅");
        } else {
            System.out.println("Invalid Move ❌");
        }

        // Display board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}