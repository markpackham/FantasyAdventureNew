package tests;

import characters.Cleric;
import characters.Enemy;
import characters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ClericTest {

    Cleric cleric1;
    Warrior warrior1;
    Enemy goblin1;

    @Before
    public void before(){
        cleric1 = new Cleric("Helm", 200, 200, 10, 10, 10, 10, null,
                50, 50,5, 5, 5, 5, 5);

        warrior1 = new Warrior("Adjantis", 400, 400, 10, 10, 50, 50, null, 10, 10);

        goblin1 = new Enemy("Goblin Chief", 10, 10, 5, 5, 5, 5, null);
    }

    @Test
    public void enemyDestoryArmourLowerHealthThenHeal(){
        goblin1.doMeeleAttack(warrior1);
        assertEquals(5,warrior1.getArmourHealth());
        goblin1.doMeeleAttack(warrior1);
        assertEquals(0,warrior1.getArmourHealth());
        goblin1.doMeeleAttack(warrior1);
        goblin1.doMeeleAttack(warrior1);
        goblin1.doMeeleAttack(warrior1);
        assertEquals(385,warrior1.getHealth());
        cleric1.healSpell(warrior1);
        assertEquals(390,warrior1.getHealth());
        assertEquals(49,cleric1.getMagicLevel());
        cleric1.healSpell(warrior1);
        cleric1.healSpell(warrior1);
        cleric1.healSpell(warrior1);
        assertEquals(400,warrior1.getHealth());
        assertEquals(46,cleric1.getMagicLevel());
    }

    @Test
    public void strengthPotion(){
        warrior1.setMeeleAttack(0);
        cleric1.strengthPotion(warrior1);
        assertEquals(5,warrior1.getMeeleAttack());
        assertEquals(4,cleric1.getStrengthPotionAmount());
    }

    @Test
    public void healPotion(){
        cleric1.setHealth(10);
        cleric1.healPotion(cleric1);
        assertEquals(20,cleric1.getHealth());
        assertEquals(4,cleric1.getHealPotionAmount());
    }
}
