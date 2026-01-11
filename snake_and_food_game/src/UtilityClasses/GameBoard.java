package snake_and_food_game.src.UtilityClasses;

public class GameBoard {
    private static GameBoard instance;
    private final int width;
    private final int height;

    private GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static GameBoard getInstance(int width, int height) {
        if (instance == null) {
            instance = new GameBoard(width, height);
        }
        return instance;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
