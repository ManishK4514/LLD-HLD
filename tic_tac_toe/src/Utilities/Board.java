package tic_tac_toe.src.Utilities;

import tic_tac_toe.src.CommonEnum.Symbol;
import tic_tac_toe.src.GameStateHandler.Context.GameContext;

public class Board {
    private Symbol[][] grid;
    private final int rows;
    private final int cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Symbol[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public boolean makeMove(Position position, Symbol playerSymbol) {
        if (isValidMove(position)) {
            grid[position.row][position.col] = playerSymbol;
            return true;
        }
        return false;
    }

    public boolean isValidMove(Position position) {
        if (position.row < 0 || position.row >= rows || position.col < 0 || position.col >= cols) {
            return false;
        }
        return grid[position.row][position.col] == Symbol.EMPTY;
    }

    public void checkGameState(GameContext context, Player currentPlayer) {
        for (int i = 0; i < rows; i++) {
            if (isWinningLine(grid[i])) {
                context.next(currentPlayer, true);
                return;
            }            
        }

        for (int j = 0; j < cols; j++) {
            Symbol[] column = new Symbol[rows];
            for (int i = 0; i < rows; i++) {
                column[i] = grid[i][j];
            }
            if (isWinningLine(column)) {
                context.next(currentPlayer, true);
                return;
            }
        }

        Symbol[] diag1 = new Symbol[Math.min(rows, cols)];
        Symbol[] diag2 = new Symbol[Math.min(rows, cols)];

        for (int i = 0; i < Math.min(rows, cols); i++) {
            diag1[i] = grid[i][i];
            diag2[i] = grid[i][cols - i - 1];
        }
        
        if(diag1[0] != Symbol.EMPTY && isWinningLine(diag1)) {
            context.next(currentPlayer, true);
            return;
        }

        if(diag2[0] != Symbol.EMPTY && isWinningLine(diag2)) {
            context.next(currentPlayer, true);
            return;
        }
    }

    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        if (first == Symbol.EMPTY) {
            return false;
        }
        for (Symbol symbol : line) {
            if (symbol != first) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (grid[i][j]) {
                    case X -> System.out.print("X ");
                    case O -> System.out.print("O ");
                    case EMPTY -> System.out.print(". ");
                    default -> throw new AssertionError();
                }
            }
            System.out.println();
        }
    }
}
