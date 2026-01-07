package tic_tac_toe.src.PlayerStrategies;

import tic_tac_toe.src.Utilities.Board;
import tic_tac_toe.src.Utilities.Position;

public interface PlayerStrategy {
    Position makeMove(Board board);
}
