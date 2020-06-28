package characters;

import java.util.ArrayList;

public class Enemy extends GameCharacter {
    public Enemy(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, int gold, ArrayList items) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, gold, items);
    }
}
