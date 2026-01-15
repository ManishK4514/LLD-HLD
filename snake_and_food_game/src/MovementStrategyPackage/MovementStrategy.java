package snake_and_food_game.src.MovementStrategyPackage;

import snake_and_food_game.src.UtilityClasses.Pair;

public interface MovementStrategy {
    Pair getNextPosition(Pair currentPosition, String direction);
}
