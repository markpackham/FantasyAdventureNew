package characters;

import behaviours.IWeapon;

import java.util.ArrayList;

public class Warrior extends NonMagicUser implements IWeapon {

    private int weaponCoolDown;
    private int weaponCoolDownMax;

    public Warrior(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, int gold, ArrayList items, int weaponCoolDown, int weaponCoolDownMax) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, gold, items);
        this.weaponCoolDown = weaponCoolDown;
        this.weaponCoolDownMax = weaponCoolDownMax;
    }

    public int getWeaponCoolDown() {
        return weaponCoolDown;
    }

    public void setWeaponCoolDown(int weaponCoolDown) {
        this.weaponCoolDown = weaponCoolDown;
    }

    public int getWeaponCoolDownMax() {
        return weaponCoolDownMax;
    }

    public void setWeaponCoolDownMax(int weaponCoolDownMax) {
        this.weaponCoolDownMax = weaponCoolDownMax;
    }

    public void restFromAttacking(){
        weaponCoolDown += 5;
        if(weaponCoolDown > weaponCoolDownMax){
            weaponCoolDown = weaponCoolDownMax;
        }
    }

    @Override
    public void giantHammerAttack(Enemy enemy) {
        if(weaponCoolDown > 0){
            enemy.health -= meeleAttack + 30;
            weaponCoolDown -= 5;
        }
    }

    @Override
    public void swordAttack(Enemy enemy) {
        if(weaponCoolDown > 0){
            enemy.health -= meeleAttack + 20;
            weaponCoolDown -= 4;
        }
    }

    @Override
    public void spearAttack(Enemy enemy) {
        if(weaponCoolDown > 0){
            enemy.health -= meeleAttack + 10;
            weaponCoolDown -= 3;
        }
    }

    @Override
    public void daggerAttack(Enemy enemy) {
        if(weaponCoolDown > 0){
            enemy.health -= meeleAttack + 5;
            weaponCoolDown -= 1;
        }
    }
}
