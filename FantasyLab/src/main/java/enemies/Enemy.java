package enemies;

import behaviours.IAttack;
import behaviours.IDefend;
import behaviours.ITakeDamage;


public abstract class Enemy implements ITakeDamage {
    private String name;
    private int hp;

    public Enemy(String name, int hp) {
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
        if (this instanceof IDefend) {
            this.hp -= damage * 0.50;
        }
        this.hp -= damage;
    }
}