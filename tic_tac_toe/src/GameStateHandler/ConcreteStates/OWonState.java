package tic_tac_toe.src.GameStateHandler.ConcreteStates;

import tic_tac_toe.src.GameStateHandler.GameState;
import tic_tac_toe.src.GameStateHandler.Context.GameContext;
import tic_tac_toe.src.Utilities.Player;

public class OWonState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        // Game is already over, no further state transitions.
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
    
}
