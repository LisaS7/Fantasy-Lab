package player;

import behaviours.IDefend;
import behaviours.ITakeDamage;

public abstract class Player implements ITakeDamage {
    private String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public void takeDamage(int damage) {
        int finalDamage = damage;

        if (this instanceof IDefend) {
            finalDamage = (int) (damage * 0.75);
        }

        if (this.hp - finalDamage < 0) {
            this.hp = 0;
        }

        this.hp -= damage;
    }

    public void heal(int points) {
        this.hp += points;
    }
}
