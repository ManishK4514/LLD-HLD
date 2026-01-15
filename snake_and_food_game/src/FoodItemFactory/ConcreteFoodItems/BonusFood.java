package snake_and_food_game.src.FoodItemFactory.ConcreteFoodItems;

import snake_and_food_game.src.FoodItemFactory.FoodItem;

public class BonusFood extends FoodItem {
    public BonusFood(int row, int column) {
        super(row, column); 
        this.points = 3;
    }    
}
