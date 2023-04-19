package playerTest.fighters;

import enums.WeaponType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.fighters.Barbarian;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @BeforeEach
    void setUp() {
        barbarian = new Barbarian("Glop", 75);
    }

    @Test
    void hasName() {
        assertEquals("Glop", barbarian.getName());
    }

    @Test
    void hasHp() {
        assertEquals(75, barbarian.getHp());
    }

    @Test
    void canChangeWeapon() {
        barbarian.changeWeapon(WeaponType.CLUB);
        assertEquals(WeaponType.CLUB, barbarian.getWeapon() );
    }

    @Test
    void canTakeDamage() {
        barbarian.takeDamage(50);
        assertEquals(25, barbarian.getHp());
    }

    @Test
    void canHeal() {
        barbarian.heal(20);
        assertEquals(95, barbarian.getHp());
    }
}
