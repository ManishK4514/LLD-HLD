package snake_and_food_game;

import java.util.Scanner;
import snake_and_food_game.src.controller.SnakeGame;

class Main {
    public static void main(String[] args) {
        // Define game configuration
        // can be taken as user input as well
        int width = 20;
        int height = 15;

        // Define some food positions (more can be generated during gameplay)
        int[][] foodPositions = { {0, 1}, {10, 8}, {3, 12}, {8, 17}, {12, 3} };

        // Initialize and start the game
        SnakeGame game = new SnakeGame(width, height, foodPositions);

        // Display game instructions
        System.out.println("Welcome to the Snake and Food Game!");
        System.out.println("Controls: Use W (up), A (left), S (down), D (right) to move the snake.");
        System.out.println("Objective: Eat food to grow the snake and score points. Avoid collisions!");
        System.out.println("Don't hit the walls or yourself. Good luck!");

        // create scanner for user input
        boolean gameRunning = true;
        int score = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            // Main game loop
            while (gameRunning) {
                // Display current game state
                displayGameState(game);

                // Get user input for direction
                System.out.print("Enter direction (W/A/S/D) or Q to quit: ");
                String input = scanner.nextLine().toUpperCase();

                if(input.equals("Q")) {
                    System.out.println("Game ended by Player. Your final score is: " + score);
                    gameRunning = false;
                    continue;
                }

                String direction = convertInputToDirection(input);

                if(direction.isEmpty()) {
                    System.out.println("Invalid input. Please enter W, A, S, D or Q.");
                    continue;
                }

                score = game.move(direction);
                if(score == -1) {
                    System.out.println("Game Over! Your final score is: " + (score + 1));
                    gameRunning = false;
                }
                else {
                    System.out.println("Current Score: " + score);
                }            
            }
        }

        System.out.println("Thank you for playing!");
    }

    private static void displayGameState(SnakeGame game) {
        // Placeholder for displaying the game state
        // This could include printing the game board, snake position, food position, etc.
        System.out.println("nCurrent snake length: " + (game.getSnake().size()));
    }

    private static String convertInputToDirection(String input) {
        return switch (input) {
            case "W" -> "UP";
            case "A" -> "LEFT";
            case "S" -> "DOWN";
            case "D" -> "RIGHT";
            default -> "";
        };
    }
}