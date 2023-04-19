package playerTest;

import enums.WeaponType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.Dwarf;
import player.Knight;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @BeforeEach
    void setUp() {
        dwarf = new Dwarf("Sanmag Flatbeard", 100);
    }

    @Test
    void hasName() {
        assertEquals("Sanmag Flatbeard", dwarf.getName());
    }

    @Test
    void hasHp() {
        assertEquals(100, dwarf.getHp());
    }

    @Test
    void canChangeWeapon() {
        dwarf.changeWeapon(WeaponType.AXE);
        assertEquals(WeaponType.AXE, dwarf.getWeapon() );
    }

    @Test
    void canTakeDamage() {
        dwarf.takeDamage(50);
        assertEquals(50, dwarf.getHp());
    }

    @Test
    void canHeal() {
        dwarf.heal(20);
        assertEquals(120, dwarf.getHp());
    }
}
