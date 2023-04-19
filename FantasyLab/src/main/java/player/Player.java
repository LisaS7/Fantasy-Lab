package player;

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
        this.hp -= damage;
    }

    public void heal(int points) {
        this.hp += points;
    }
}
