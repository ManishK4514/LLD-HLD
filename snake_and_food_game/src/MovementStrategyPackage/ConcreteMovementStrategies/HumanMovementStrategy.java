package snake_and_food_game.src.MovementStrategyPackage.ConcreteMovementStrategies;

import snake_and_food_game.src.MovementStrategyPackage.MovementStrategy;
import snake_and_food_game.src.UtilityClasses.Pair;

public class HumanMovementStrategy implements MovementStrategy {
    @Override
    public Pair getNextPosition(Pair currentHead, String direction) {
        int row = currentHead.getRow();
        int col = currentHead.getCol();

        return switch (direction) {
            case "UP" -> new Pair(row - 1, col);
            case "DOWN" -> new Pair(row + 1, col);
            case "LEFT" -> new Pair(row, col - 1);
            case "RIGHT" -> new Pair(row, col + 1);
            default -> throw new AssertionError();
        };
    }
}
