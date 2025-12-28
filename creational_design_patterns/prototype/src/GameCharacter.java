package creational_design_patterns.prototype.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameCharacter implements Prototype<GameCharacter> {
    private final String type;
    private final int health;
    private final List<String> weapons;
    private final Map<String, Integer> skills;

    public GameCharacter(String type) {
        this.type = type;
        this.health = 100;
        this.weapons = new ArrayList<>();
        this.skills = new HashMap<>();

        weapons.add("Sword");
        weapons.add("Shield");

        skills.put("Strength", 10);
        skills.put("Defense", 8);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    // deep clone
    public GameCharacter(GameCharacter original) {
        this.type = original.type;
        this.health = original.health;
        this.weapons = new ArrayList<>(original.weapons);
        this.skills = new HashMap<>(original.skills);
    }

    @Override
    public GameCharacter clone() {
        return new GameCharacter(this);
    }

    public void addWeapon(String weapon) {
        weapons.add(weapon);
    }

    public void show() {
        System.out.println(type + " | HP: " + health + " | Weapons: " + weapons + " | Skills: " + skills);
    }

}
