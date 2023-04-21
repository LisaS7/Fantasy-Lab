package player;

import behaviours.IHeal;
import enemies.Enemy;
import enemies.Ghoul;
import enums.HealType;

import java.util.ArrayList;
import java.util.List;

public class Cleric extends Player implements IHeal {

    private final ArrayList<HealType> items = new ArrayList<>();

    public Cleric(String name, int hp) {
        super(name, hp);
    }

    public HealType getItem() {
        int randomIndex = (int) (Math.random() * items.size());
        return items.get(randomIndex);
    }

    @Override
    public void heal(Player player) {
        HealType randomItem = getItem();
        player.heal(randomItem.getHealPoints());
    }

    public void heal(Enemy enemy) {
        if (enemy instanceof Ghoul) {
            HealType item = getItem();
            enemy.takeDamage(item.getHealPoints());
        }
    }

    public void addItems(HealType ...items) {
        this.items.addAll(List.of(items));
    }
}
