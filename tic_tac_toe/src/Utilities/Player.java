package tic_tac_toe.src.Utilities;

import tic_tac_toe.src.CommonEnum.Symbol;
import tic_tac_toe.src.PlayerStrategies.PlayerStrategy;

public class Player {
    private final Symbol symbol;
    private final PlayerStrategy strategy;

    public Player(Symbol symbol, PlayerStrategy strategy) {
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerStrategy getStrategy() {
        return strategy;
    }
}
