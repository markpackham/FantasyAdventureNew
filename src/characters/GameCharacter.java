package characters;

import java.util.ArrayList;

public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int armourHealth;
    protected int maxArmourHealth;
    protected int meeleAttack;
    protected int maxMeeleAttack;
    protected ArrayList items;

    public GameCharacter(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, ArrayList items) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.armourHealth = armourHealth;
        this.maxArmourHealth = maxArmourHealth;
        this.meeleAttack = meeleAttack;
        this.maxMeeleAttack = maxMeeleAttack;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getArmourHealth() {
        return armourHealth;
    }

    public void setArmourHealth(int armourHealth) {
        this.armourHealth = armourHealth;
    }

    public int getMaxArmourHealth() {
        return maxArmourHealth;
    }

    public void setMaxArmourHealth(int maxArmourHealth) {
        this.maxArmourHealth = maxArmourHealth;
    }

    public int getMeeleAttack() {
        return meeleAttack;
    }

    public void setMeeleAttack(int meeleAttack) {
        this.meeleAttack = meeleAttack;
    }

    public int getMaxMeeleAttack() {
        return maxMeeleAttack;
    }

    public void setMaxMeeleAttack(int maxMeeleAttack) {
        this.maxMeeleAttack = maxMeeleAttack;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public void doMeeleAttack(GameCharacter character){
        if(character.health > 0) {
            if (character.armourHealth > 0) {
                character.armourHealth -= meeleAttack;
            } else {
                character.health -= meeleAttack;
            }
        }
    }
}
