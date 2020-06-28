package rooms;

import characters.Enemy;
import characters.Hero;

import java.util.ArrayList;

public class Tent extends Room {
    public Tent(String name, ArrayList<Hero> heroes, ArrayList<Enemy> enemies, ArrayList<ExitType> exists, int gold) {
        super(name, heroes, enemies, exists, gold);
    }
}
