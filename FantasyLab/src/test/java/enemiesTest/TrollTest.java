package enemiesTest;

import enemies.Troll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrollTest {

    Troll troll;

    @BeforeEach
    void setUp() {
        troll = new Troll("Troll", 25);
    }

    @Test
    void hasName() {
        assertEquals("Troll", troll.getName());
    }

    @Test
    void hasHp() {
        assertEquals(25, troll.getHp());
    }

    @Test
    void canTakeDamage() {
        troll.takeDamage(5);
        assertEquals(20, troll.getHp());
    }
}
