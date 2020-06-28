package behaviours;

import characters.Enemy;
import characters.GameCharacter;

public interface IWeapon {

    void giantHammerAttack(Enemy enemy);

    void swordAttack(Enemy enemy);

    void spearAttack(Enemy enemy);

    void daggerAttack(Enemy enemy);
}
