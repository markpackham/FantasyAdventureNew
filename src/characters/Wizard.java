package characters;

import java.util.ArrayList;

public class Wizard extends MagicUser {
    public Wizard(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, ArrayList items, int magicLevel, int magicMaxLevel, int magicAttack, int maxMagicAttack) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, items, magicLevel, magicMaxLevel, magicAttack, maxMagicAttack);
    }
}
