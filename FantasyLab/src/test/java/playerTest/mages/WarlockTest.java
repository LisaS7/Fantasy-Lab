package playerTest.mages;

import enums.ItemType;
import enums.SpellType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.fighters.Dwarf;
import player.mages.Warlock;

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
    void canCollectItems() {
        ItemType gold = ItemType.GOLD;
        ItemType book = ItemType.BOOK;
        warlock.collectItems(gold, book);
        assertEquals(2, warlock.getInventory().size());
    }

    @Test
    void canSellItems() {
        ItemType gold = ItemType.GOLD;
        ItemType book = ItemType.BOOK;
        warlock.collectItems(gold, book);
        warlock.sellItems(gold, book);
        int expected = ItemType.GOLD.getValue() + ItemType.BOOK.getValue();
        assertEquals(0, warlock.getInventory().size());
        assertEquals(expected, warlock.getMoney());
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
