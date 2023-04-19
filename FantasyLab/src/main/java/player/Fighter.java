package player;

import behaviours.IAttack;
import behaviours.ITakeDamage;
import enums.WeaponType;

public abstract class Fighter extends Player implements IAttack {
    private WeaponType weapon;

    public Fighter(String name, int hp) {
        super(name, hp);
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    @Override
    public void attack(ITakeDamage target) {
        int damage = this.weapon.getDamage();
            target.takeDamage(damage);
    }

    public void changeWeapon(WeaponType weapon){
        this.weapon = weapon;
    }
}
