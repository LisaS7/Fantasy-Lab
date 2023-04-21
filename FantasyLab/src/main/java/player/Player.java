package player;

import behaviours.IDefend;
import behaviours.ITakeDamage;
import enums.ItemType;

import java.util.ArrayList;
import java.util.List;

public abstract class Player implements ITakeDamage {
    private final String name;
    private int hp;
    private int money;
    private final ArrayList<ItemType> inventory = new ArrayList<>();

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

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public ArrayList<ItemType> getInventory() {
        return inventory;
    }

    public void collectItems(ItemType ...items) {
        inventory.addAll(List.of(items));
    }

    public void sellItems(ItemType ...items) {
        for (ItemType item : items) {
            if (inventory.contains(item)) {
                this.inventory.remove(item);
                addMoney(item.getValue());
            }
        }
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
