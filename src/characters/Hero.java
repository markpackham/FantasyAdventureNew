package characters;

import rooms.Room;

import java.util.ArrayList;

public class Hero extends GameCharacter {

    public Hero(String name, int health, int maxHealth, int armourHealth, int maxArmourHealth, int meeleAttack, int maxMeeleAttack, int gold, ArrayList items) {
        super(name, health, maxHealth, armourHealth, maxArmourHealth, meeleAttack, maxMeeleAttack, gold, items);
    }

    public void lootRoom(Room room){
        if(room.getEnemies().size() < 1){
            gold += room.getGold();
            room.setGold(0);
        }
    }
}
