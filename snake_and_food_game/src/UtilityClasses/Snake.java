package snake_and_food_game.src.UtilityClasses;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Snake {
    private final Deque<Pair> body;
    private final Map<Pair, Boolean> positionMap;

    public Snake() {
        this.body = new LinkedList<>();
        this.positionMap = new HashMap<>();
        Pair initialPosition = new Pair(0, 0);
        this.body.addFirst(initialPosition);
        this.positionMap.put(initialPosition, true);
    }

}
