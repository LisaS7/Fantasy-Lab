package enemiesTest;

import enemies.Orc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrcTest {

    Orc orc;

    @BeforeEach
    void setUp() {
        orc = new Orc("Orc", 10);
    }

    @Test
    void hasName() {
        assertEquals("Orc", orc.getName());
    }

    @Test
    void hasHp() {
        assertEquals(10, orc.getHp());
    }

    @Test
    void canTakeDamage() {
        orc.takeDamage(10);
        assertEquals(0, orc.getHp());
    }
}
