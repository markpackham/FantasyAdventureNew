package tests;

import characters.Enemy;
import org.junit.Before;
import org.junit.Test;
import rooms.Tent;

import static org.junit.Assert.assertEquals;

public class TentTest {
    Tent tent1;
    Enemy giant1;
    @Before
    public void before(){
        tent1 = new Tent("Goblin Tent", null,null,null,300);
        giant1 = new Enemy("Human Giant", 1000, 1000, 5, 5, 500, 5, 50, null);
    }

    @Test
    public void addEnemey(){
        tent1.addEnemy(giant1);
        assertEquals(1,tent1.getEnemies().size());
    }

    @Test
    public void removeEnemey(){
        tent1.addEnemy(giant1);
        tent1.removeEnemy(giant1);
        assertEquals(0,tent1.getEnemies().size());
    }
}
