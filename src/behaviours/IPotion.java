package behaviours;

import characters.GameCharacter;
import characters.MagicUser;

public interface IPotion {

    void healPotion(GameCharacter character);

    void strengthPotion(GameCharacter character);

    void magicPotion(MagicUser character);
}
