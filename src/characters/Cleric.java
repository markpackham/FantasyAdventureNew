package characters;

import behaviours.IPotion;

import java.util.ArrayList;

public class Cleric extends MagicUser implements IPotion {

    private int healPotionAmount;
    private int strengthPotionAmount;
    private int magicRestorePotionAmount;

    public Cleric(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, ArrayList items, int magicLevel,
                  int magicMaxLevel, int magicAttack, int maxMagicAttack, int healPotionAmount, int strengthPotionAmount, int magicRestorePotionAmount) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, items, magicLevel, magicMaxLevel, magicAttack, maxMagicAttack);
    this.healPotionAmount = healPotionAmount;
    this.strengthPotionAmount = strengthPotionAmount;
    this.magicRestorePotionAmount = magicRestorePotionAmount;
    }

    public int getHealPotionAmount() {
        return healPotionAmount;
    }

    public void setHealPotionAmount(int healPotionAmount) {
        this.healPotionAmount = healPotionAmount;
    }

    public int getStrengthPotionAmount() {
        return strengthPotionAmount;
    }

    public void setStrengthPotionAmount(int strengthPotionAmount) {
        this.strengthPotionAmount = strengthPotionAmount;
    }

    public int getMagicRestorePotionAmount() {
        return magicRestorePotionAmount;
    }

    public void setMagicRestorePotionAmount(int magicRestorePotionAmount) {
        this.magicRestorePotionAmount = magicRestorePotionAmount;
    }

    @Override
    public void healPotion(GameCharacter character) {
        if(healPotionAmount > 0){
            character.health += 10;
            if(character.health > character.maxHealth){
                character.health = character.maxHealth;
            }
            healPotionAmount --;
        }
    }

    @Override
    public void strengthPotion(GameCharacter character) {
        if(strengthPotionAmount > 0){
            character.meeleAttack += 5;
        }
        strengthPotionAmount --;
    }

    @Override
    public void magicPotion(MagicUser character) {
        if(magicRestorePotionAmount > 0){
            character.magicLevel += 10;
            if(character.magicLevel > character.magicMaxLevel){
                character.magicLevel = character.magicMaxLevel;
            }
            magicRestorePotionAmount --;
        }
    }

    public void healSpell(GameCharacter character) {
        if(magicLevel > 0 ){
            character.health += 5;
            if(character.health > character.maxHealth){
                character.health = character.maxHealth;
            }
            magicLevel --;
        }
    }

}