package tic_tac_toe.src.GameStateHandler.ConcreteStates;

import tic_tac_toe.src.CommonEnum.Symbol;
import tic_tac_toe.src.GameStateHandler.Context.GameContext;
import tic_tac_toe.src.GameStateHandler.GameState;
import tic_tac_toe.src.Utilities.Player;

public class OTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon, boolean isDraw) {
        if (hasWon) {
            context.setCurrentState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        } else if (isDraw) {
            context.setCurrentState(new DrawState());
        } else {
            context.setCurrentState(new XTurnState());
        }
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
