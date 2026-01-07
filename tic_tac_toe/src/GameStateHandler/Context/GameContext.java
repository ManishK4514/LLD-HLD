package tic_tac_toe.src.GameStateHandler.Context;

import tic_tac_toe.src.GameStateHandler.GameState;
import tic_tac_toe.src.GameStateHandler.ConcreteStates.XTurnState;
import tic_tac_toe.src.Utilities.Player;

public class GameContext {
    private GameState currentState; 

    public GameContext() {
        this.currentState = new XTurnState();
    }

    public void setState(GameState state) {
        this.currentState = state;
    }

    public boolean isGameOver() {
        return currentState.isGameOver();
    }

    public void next(Player player, boolean hasWon) {
        currentState.next(this, player, hasWon);
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }
}
