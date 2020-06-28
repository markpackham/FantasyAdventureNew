package tests;

import characters.Enemy;
import characters.Warrior;
import org.junit.Before;
import org.junit.Test;
import rooms.Tent;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior1;
    Enemy giant1;
    Tent tent1;

    @Before
    public void before(){
        warrior1 = new Warrior("Adjantis", 400, 400, 10, 10, 50, 50, 20, null, 10, 10);
        giant1 = new Enemy("Human Giant", 1000, 1000, 5, 5, 500, 5, 50, null);
        tent1 = new Tent("Goblin Tent", null,null,null,300);
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

    @Test
    public void weaponMaxLimit(){
        warrior1.restFromAttacking();
        warrior1.restFromAttacking();
        warrior1.restFromAttacking();
        warrior1.restFromAttacking();
        assertEquals(10, warrior1.getWeaponCoolDown());
    }

    @Test
    public void lootRoom(){
        warrior1.lootRoom(tent1);
        assertEquals(320, warrior1.getGold());
        assertEquals(0, tent1.getGold());
    }

    @Test
    public void lootRoom__fail_has_enemies(){
        tent1.addEnemy(giant1);
        warrior1.lootRoom(tent1);
        assertEquals(20, warrior1.getGold());
        assertEquals(300, tent1.getGold());
    }
}
