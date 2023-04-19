package player;

import behaviours.IHeal;
import enums.HealType;

import java.util.ArrayList;
import java.util.List;

public class Cleric extends Player implements IHeal {

    private ArrayList<HealType> items = new ArrayList<>();

    public Cleric(String name, int hp) {
        super(name, hp);
    }

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
