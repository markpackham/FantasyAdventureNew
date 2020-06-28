package rooms;

import characters.Enemy;
import characters.Hero;

import java.util.ArrayList;

public abstract class Room {
    protected String name;
    protected ArrayList<Hero> heroes;
    protected ArrayList<Enemy> enemies;
    protected ArrayList<ExitType> exists;
    protected int gold;

    public Room(String name, ArrayList<Hero> heroes, ArrayList<Enemy> enemies, ArrayList<ExitType> exists, int gold) {
        this.name = name;
        this.heroes = new ArrayList<Hero>();
        this.enemies = new ArrayList<Enemy>();
        this.exists = new ArrayList<ExitType>();
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<ExitType> getExists() {
        return exists;
    }

    public void setExists(ArrayList<ExitType> exists) {
        this.exists = exists;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy){
        this.enemies.remove(enemy);
    }
}
