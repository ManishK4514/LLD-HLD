package creational_design_patterns.prototype.src;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {

    private static final Map<String, GameCharacter> characters = new HashMap<>();

    static {
        characters.put("WARRIOR", new GameCharacter("Warrior"));
        characters.put("MAGE", new GameCharacter("Mage"));
    }

    public static GameCharacter getCharacter(String type) {
        return characters.get(type).clone();
    }
}