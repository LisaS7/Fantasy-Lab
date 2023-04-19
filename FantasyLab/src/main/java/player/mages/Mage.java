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

    public SpellType getSpell(String name) {
        for (SpellType spell: spells) {
            if(spell.name().equals(name)) {
                return spell;
            }
        }
        return null;
    }

    @Override
    public void cast(ITakeDamage target, String spellName) {
        SpellType spell = getSpell(spellName);
        int damage = spell.getDamage();
        target.takeDamage(damage);
    }

    public void learnSpell(SpellType spell) {
        spells.add(spell);
    }

}
