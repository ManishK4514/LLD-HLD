package tic_tac_toe;

import tic_tac_toe.src.Controller.GameController.TicTacToeGame;
import tic_tac_toe.src.PlayerStrategies.PlayerStrategy;
import tic_tac_toe.src.PlayerStrategies.ConcreteStrategies.HumanPlayerStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        PlayerStrategy playerXStrategy = new HumanPlayerStrategy("Player X");
        PlayerStrategy playerOStrategy = new HumanPlayerStrategy("Player O");
        TicTacToeGame game = new TicTacToeGame(playerXStrategy, playerOStrategy, 3, 3);
        game.play();
    }
}
