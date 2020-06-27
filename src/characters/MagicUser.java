package characters;

import java.util.ArrayList;

public abstract class MagicUser extends GameCharacter {
    protected int magicLevel;
    protected int magicMaxLevel;
    protected int magicAttack;
    protected int maxMagicAttack;

    public MagicUser(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, ArrayList items, int magicLevel, int magicMaxLevel, int magicAttack, int maxMagicAttack) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, items);
        this.magicLevel = magicLevel;
        this.magicMaxLevel = magicMaxLevel;
        this.magicAttack = magicAttack;
        this.maxMagicAttack = maxMagicAttack;
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }

    public int getMagicMaxLevel() {
        return magicMaxLevel;
    }

    public void setMagicMaxLevel(int magicMaxLevel) {
        this.magicMaxLevel = magicMaxLevel;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public int getMaxMagicAttack() {
        return maxMagicAttack;
    }

    public void setMaxMagicAttack(int maxMagicAttack) {
        this.maxMagicAttack = maxMagicAttack;
    }
}
