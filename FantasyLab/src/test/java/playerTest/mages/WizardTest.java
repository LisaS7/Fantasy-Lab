package playerTest.mages;

import enums.SpellType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.fighters.Dwarf;
import player.mages.Wizard;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {

    Wizard wizard;

    @BeforeEach
    void setUp() {
        wizard = new Wizard("Erius", 160);

    }

    @Test
    void hasName() {
        assertEquals("Erius", wizard.getName());
    }

    @Test
    void hasHp() {
        assertEquals(160, wizard.getHp());
    }

    @Test
    void canLearnSpell() {
        wizard.learnSpell(SpellType.CURSE);
        assertEquals(SpellType.CURSE, wizard.getSpell("CURSE"));
    }

    @Test
    void canCastSpell() {
        Dwarf dwarf = new Dwarf("Boggum", 120);
        wizard.learnSpell(SpellType.CURSE);
        wizard.cast(dwarf, "CURSE");
        int expected = 120 - SpellType.CURSE.getDamage();
        assertEquals(expected, dwarf.getHp());
    }
}
