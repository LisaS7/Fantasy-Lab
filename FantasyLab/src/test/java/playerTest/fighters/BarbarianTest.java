package playerTest.fighters;

import enemies.Dragon;
import enums.ItemType;
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
        barbarian.changeWeapon(WeaponType.AXE);
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
    void canCollectItems() {
        ItemType gold = ItemType.GOLD;
        ItemType book = ItemType.BOOK;
        barbarian.collectItems(gold, book);
        assertEquals(2, barbarian.getInventory().size());
    }

    @Test
    void canSellItems() {
        ItemType gold = ItemType.GOLD;
        ItemType book = ItemType.BOOK;
        barbarian.collectItems(gold, book);
        barbarian.sellItems(gold, book);
        int expected = ItemType.GOLD.getValue() + ItemType.BOOK.getValue();
        assertEquals(0, barbarian.getInventory().size());
        assertEquals(expected, barbarian.getMoney());
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

    @Test
    void canAttack() {
        Dragon dragon = new Dragon("Egoth", 130);
        barbarian.attack(dragon);
        int expected = 130 - WeaponType.AXE.getDamage();
        assertEquals(expected, dragon.getHp());
    }
}
