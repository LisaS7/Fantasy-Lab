package playerTest.fighters;

import enemies.Dragon;
import enums.ItemType;
import enums.WeaponType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.fighters.Dwarf;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @BeforeEach
    void setUp() {

        dwarf = new Dwarf("Sanmag Flatbeard", 100);
        dwarf.changeWeapon(WeaponType.AXE);
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
    void canCollectItems() {
        ItemType gold = ItemType.GOLD;
        ItemType book = ItemType.BOOK;
        dwarf.collectItems(gold, book);
        assertEquals(2, dwarf.getInventory().size());
    }

    @Test
    void canSellItems() {
        ItemType gold = ItemType.GOLD;
        ItemType book = ItemType.BOOK;
        dwarf.collectItems(gold, book);
        dwarf.sellItems(gold, book);
        int expected = ItemType.GOLD.getValue() + ItemType.BOOK.getValue();
        assertEquals(0, dwarf.getInventory().size());
        assertEquals(expected, dwarf.getMoney());
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

    @Test
    void canAttack() {
        Dragon dragon = new Dragon("Egoth", 130);
        dwarf.attack(dragon);
        int expected = 130 - WeaponType.AXE.getDamage();
        assertEquals(expected, dragon.getHp());
    }
}
