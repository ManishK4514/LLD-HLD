package tic_tac_toe.src.PlayerStrategies.ConcreteStrategies;

import java.util.Scanner;
import tic_tac_toe.src.PlayerStrategies.PlayerStrategy;
import tic_tac_toe.src.Utilities.Board;
import tic_tac_toe.src.Utilities.Position;

public class HumanPlayerStrategy implements PlayerStrategy {
    private Scanner scanner;
    private String playerName;

    public HumanPlayerStrategy(String playerName) {
        this.scanner = new Scanner(System.in);
        this.playerName = playerName;
    }

    @Override
    public Position makeMove(Board board) {
        while (true) {
            try {
                System.out.print(playerName + ", enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Position move = new Position(row, col);
                if (board.isValidMove(move)) {
                    return move;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numeric values for row and column.");
                scanner.next(); 
            }
        }
    }
}