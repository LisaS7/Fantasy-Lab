package player;

import behaviours.IHeal;
import enums.HealType;

import java.util.ArrayList;
import java.util.List;

public class Cleric implements IHeal {

    private ArrayList<HealType> items;

    @Override
    public void heal(Player player) {
        int randomIndex = (int) (Math.random() * items.size());
        HealType randomItem = items.get(randomIndex);
        player.heal(randomItem.getHealPoints());
    }

    public void addItems(HealType ...items) {
        this.items.addAll(List.of(items));
    }
}
