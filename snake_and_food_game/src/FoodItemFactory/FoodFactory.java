package snake_and_food_game.src.FoodItemFactory;

import snake_and_food_game.src.FoodItemFactory.ConcreteFoodItems.BonusFood;
import snake_and_food_game.src.FoodItemFactory.ConcreteFoodItems.NormalFood;

public class FoodFactory {
    public static FoodItem createFood(int[] position, String type) {
        if (type == null) {
            throw new IllegalArgumentException("Unknown food type: " + type);
        }
        return switch (type) {
            case "bonus" -> new BonusFood(position[0], position[1]);
            case "regular" -> new NormalFood(position[0], position[1]);
            default -> throw new IllegalArgumentException("Unknown food type: " + type);
        };
    }
}
