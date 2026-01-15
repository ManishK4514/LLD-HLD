package snake_and_food_game.src.MovementStrategyPackage.ConcreteMovementStrategies;

import snake_and_food_game.src.MovementStrategyPackage.MovementStrategy;
import snake_and_food_game.src.UtilityClasses.Pair;

public class AIMovementStrategy implements MovementStrategy {
    @Override
    public Pair getNextPosition(Pair currentHead, String direction) {
        // AI logic to determine the next position based on the current head position
        // and the game state (e.g., food position, obstacles, etc.)
        // For simplicity, let's assume the AI always moves towards the right.
        int row = currentHead.getRow();
        int col = currentHead.getCol();
        return new Pair(row, col + 1);
    }
    
}
