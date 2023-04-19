package playerTest.fighters;

import enemies.Dragon;
import enums.WeaponType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.fighters.Knight;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    Knight knight;

    @BeforeEach
    void setUp() {
        knight = new Knight("Derek of Aberdeen", 250);
        knight.changeWeapon(WeaponType.SWORD);
    }

    @Test
    void hasName() {
        assertEquals("Derek of Aberdeen", knight.getName());
    }

    @Test
    void hasHp() {
        assertEquals(250, knight.getHp());
    }

    @Test
    void canChangeWeapon() {
       knight.changeWeapon(WeaponType.CLUB);
        assertEquals(WeaponType.CLUB, knight.getWeapon() );
    }

    @Test
    void canTakeDamage() {
        knight.takeDamage(50);
        assertEquals(200, knight.getHp());
    }

    @Test
    void canHeal() {
        knight.heal(20);
        assertEquals(270, knight.getHp());
    }

    @Test
    void canAttack() {
        Dragon dragon = new Dragon("Egoth", 130);
        knight.attack(dragon);
        int expected = 130 - WeaponType.SWORD.getDamage();
        assertEquals(expected, dragon.getHp());
    }
}