package tests;

import characters.Enemy;
import characters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior1;
    Enemy giant1;

    @Before
    public void before(){
        warrior1 = new Warrior("Adjantis", 400, 400, 10, 10, 50, 50, null, 10, 10);
        giant1 = new Enemy("Human Giant", 1000, 1000, 5, 5, 500, 5, null);
    }

    @Test
    public void weaponCooldownRestore(){
        warrior1.giantHammerAttack(giant1);
        warrior1.daggerAttack(giant1);
        assertEquals(4, warrior1.getWeaponCoolDown());
        assertEquals(865,giant1.getHealth());
        warrior1.restFromAttacking();
        assertEquals(9, warrior1.getWeaponCoolDown());
    }

    public void weaponMaxLimit(){
        warrior1.restFromAttacking();
        warrior1.restFromAttacking();
        warrior1.restFromAttacking();
        warrior1.restFromAttacking();
        assertEquals(10, warrior1.getWeaponCoolDown());
    }
}
