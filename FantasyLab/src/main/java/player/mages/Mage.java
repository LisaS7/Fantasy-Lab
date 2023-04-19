package player.mages;

import behaviours.ICast;
import behaviours.IDefend;
import behaviours.ITakeDamage;
import enums.SpellType;
import player.Player;

import java.util.ArrayList;

public abstract class Mage extends Player implements IDefend, ICast {
    ArrayList<SpellType> spells = new ArrayList<>();

    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void cast(ITakeDamage target) {
        int randomIndex = (int) (Math.random() * spells.size());
        SpellType spell = spells.get(randomIndex);
        int damage = spell.getDamage();
        target.takeDamage(damage);
    }

}
