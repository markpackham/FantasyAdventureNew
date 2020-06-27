package characters;

import java.util.ArrayList;

public abstract class NonMagicUser extends GameCharacter {
    public NonMagicUser(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, ArrayList items) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, items);
    }
}
