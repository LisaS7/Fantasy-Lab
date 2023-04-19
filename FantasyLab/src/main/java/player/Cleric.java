package player;

import behaviours.IHeal;
import enums.HealType;

public class Cleric implements IHeal {

    private HealType item;

    @Override
    public void heal(Player player) {
        int healPoints = item.getHealPoints();
        player.heal(healPoints);
    }
}
