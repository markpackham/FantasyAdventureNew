package rooms;

import characters.Enemy;
import characters.Hero;

import java.util.ArrayList;

public abstract class Room {
    protected ArrayList<Hero> heroes;
    protected ArrayList<Enemy> enemies;
    protected ArrayList<ExitType> exists;
}
