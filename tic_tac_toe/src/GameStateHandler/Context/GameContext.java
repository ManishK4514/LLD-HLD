package tic_tac_toe.src.GameStateHandler.Context;

import tic_tac_toe.src.GameStateHandler.ConcreteStates.XTurnState;
import tic_tac_toe.src.GameStateHandler.GameState;
import tic_tac_toe.src.Utilities.Player;

public class GameContext {
    private GameState currentState; 

    public GameContext() {
        this.currentState = new XTurnState();
    }

    public boolean isGameOver() {
        return currentState.isGameOver();
    }

    public void next(Player player, boolean hasWon, boolean isDraw) {
        currentState.next(this, player, hasWon, isDraw);
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }
}
