import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // ===== UC3: Method to get user slot =====
    public static int getUserSlot(Scanner scanner) {
        System.out.print("Enter slot (1-9): ");
        int slot = scanner.nextInt();
        return slot;
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
        int toss = random.nextInt(2);

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

        System.out.println("Player " + currentPlayer + " starts");

        // ===== UC3: Take input =====
        int slot = getUserSlot(scanner);
        System.out.println("You entered slot: " + slot);

        // Display board (UC1)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}