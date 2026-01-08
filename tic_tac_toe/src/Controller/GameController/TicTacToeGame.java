package tic_tac_toe.src.Controller.GameController;

import tic_tac_toe.src.CommonEnum.Symbol;
import tic_tac_toe.src.Controller.BoardGames;
import tic_tac_toe.src.GameStateHandler.ConcreteStates.OWonState;
import tic_tac_toe.src.GameStateHandler.ConcreteStates.XWonState;
import tic_tac_toe.src.GameStateHandler.Context.GameContext;
import tic_tac_toe.src.GameStateHandler.GameState;
import tic_tac_toe.src.PlayerStrategies.PlayerStrategy;
import tic_tac_toe.src.Utilities.Board;
import tic_tac_toe.src.Utilities.Player;
import tic_tac_toe.src.Utilities.Position;

public class TicTacToeGame implements BoardGames {
    private final Board board;
    private final Player playerX;
    private final Player playerO;
    private Player currentPlayer;
    private final GameContext gameContext;

    public TicTacToeGame(PlayerStrategy xStrategy, PlayerStrategy oStrategy, int rows, int cols) {
        this.board = new Board(rows, cols);
        this.playerX = new Player(Symbol.X, xStrategy);
        this.playerO = new Player(Symbol.O, oStrategy);
        this.currentPlayer = playerX;
        this.gameContext = new GameContext();
    }

    
    @Override
    public void play() {
        do {
            board.printBoard();

            // Get the current player's move
            Position move = currentPlayer.getStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());
            board.checkGameState(gameContext, currentPlayer);
            switchPlayer();
        } while (!gameContext.isGameOver());
        announceResult();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    private void announceResult() {
        GameState gameState = gameContext.getCurrentState();
        board.printBoard();

        if (gameState instanceof XWonState) {
            System.out.println("Game Over! Player X wins!");
        } else if (gameState instanceof OWonState) {
            System.out.println("Game Over! Player O wins!");
        } else {
            System.out.println("Game Over! It's a draw!");
        }
    }
    
}
