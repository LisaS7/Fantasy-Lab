package playerTest;

import enemies.Ghoul;
import enums.HealType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.Cleric;
import player.fighters.Dwarf;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClericTest {
    Cleric cleric;

    @BeforeEach
    void setUp() {
        cleric = new Cleric("Vita", 100);
        cleric.addItems(HealType.HERBS);
    }

    @Test
    public void hasName() {
        assertEquals("Vita", cleric.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canHeal() {
        Dwarf dwarf = new Dwarf("Boggum", 120);
        cleric.heal(dwarf);
        assertEquals(125, dwarf.getHp());
    }

    @Test
    public void healUndeadDoesDamage() {
        Ghoul ghoul = new Ghoul("Bob", 80);
        cleric.heal(ghoul);
        int expected = 80 - HealType.HERBS.getHealPoints();
        assertEquals(expected, ghoul.getHp());
    }

}
