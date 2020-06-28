package characters;

import java.util.ArrayList;

public class Wizard extends MagicUser {
    public Wizard(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, int gold, ArrayList items, int magicLevel, int magicMaxLevel, int magicAttack, int maxMagicAttack) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, gold, items, magicLevel, magicMaxLevel, magicAttack, maxMagicAttack);
    }
}
