package playerTest.mages;

import enums.SpellType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.fighters.Dwarf;
import player.mages.Warlock;
import player.mages.Wizard;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @BeforeEach
    void setUp() {
        warlock = new Warlock("Marcellus", 150);

    }

    @Test
    void hasName() {
        assertEquals("Marcellus", warlock.getName());
    }

    @Test
    void hasHp() {
        assertEquals(150, warlock.getHp());
    }

    @Test
    void canLearnSpell() {
        warlock.learnSpell(SpellType.WRATH);
        assertEquals(SpellType.WRATH, warlock.getSpell("WRATH"));
    }

    @Test
    void canCastSpell() {
        Dwarf dwarf = new Dwarf("Boggum", 120);
        warlock.learnSpell(SpellType.WRATH);
        warlock.cast(dwarf, "WRATH");
        int expected = 120 - SpellType.WRATH.getDamage();
        assertEquals(expected, dwarf.getHp());
    }
}
