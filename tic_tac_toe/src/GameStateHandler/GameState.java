package tic_tac_toe.src.GameStateHandler;

import tic_tac_toe.src.GameStateHandler.Context.GameContext;
import tic_tac_toe.src.Utilities.Player;

public interface GameState {
    void next(GameContext context, Player player, boolean hasWon);
    boolean isGameOver();
}
