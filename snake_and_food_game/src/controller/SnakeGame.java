package snake_and_food_game.src.controller;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import snake_and_food_game.src.MovementStrategyPackage.ConcreteMovementStrategies.HumanMovementStrategy;
import snake_and_food_game.src.MovementStrategyPackage.MovementStrategy;
import snake_and_food_game.src.UtilityClasses.GameBoard;
import snake_and_food_game.src.UtilityClasses.Pair;

public class SnakeGame {
    private final GameBoard gameBoard;
    private final Deque<Pair> snake;
    private final Map<Pair, Boolean> snakeMap;
    private final int[][] food;
    private int foodIndex;
    private MovementStrategy movementStrategy;

    public SnakeGame(int width, int height, int[][] food) {
        this.gameBoard = GameBoard.getInstance(width, height);
        this.food = food;
        this.foodIndex = 0;

        // Initialize snake
        this.snake = new LinkedList<>();
        this.snakeMap = new HashMap<>();
        Pair initialPosition = new Pair(0, 0);
        this.snake.addFirst(initialPosition);
        this.snakeMap.put(initialPosition, true);

        // Set default movement starategy
        this.movementStrategy = new HumanMovementStrategy();
    }

    public void setMovementStrategy(MovementStrategy strategy) {
        this.movementStrategy = strategy;
    }

    public int move(String direction) {
        Pair currentHead = this.snake.peekFirst();
        Pair newHead = this.movementStrategy.getNextPosition(currentHead, direction);
        int newHeadRow = newHead.getRow();
        int newHeadCol = newHead.getCol();

        // Check for collisions with walls
        boolean crossesBoundary = newHeadRow < 0 || newHeadRow >= this.gameBoard.getHeight() ||
                                   newHeadCol < 0 || newHeadCol >= this.gameBoard.getWidth();

        Pair currentTail = this.snake.peekLast();

        // check if snake bites itself
        boolean bitesItself = this.snakeMap.containsKey(newHead) && !(newHead.getRow() == currentTail.getRow() && newHead.getCol() == currentTail.getCol());

        if (crossesBoundary || bitesItself) {
            return -1; // Game over
        }
        
        boolean ateFood = (this.foodIndex < this.food.length &&
                           newHead.getRow() == this.food[this.foodIndex][0] &&
                           newHead.getCol() == this.food[this.foodIndex][1]);

        // Check for food consumption
        if (ateFood) {
            this.foodIndex++; // Eat the food and grow
        } else {
            // Remove tail position
           this.snake.pollLast();
           this.snakeMap.remove(currentTail);
        }

        // Add new head position
        this.snake.addFirst(newHead);
        this.snakeMap.put(newHead, true);

        // calculate score and return
        int score = this.snake.size() - 1;
        return score;
    }

    public Deque<Pair> getSnake() {
        return this.snake;
    }
}
