package enemiesTest;

import enemies.Kelpie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KelpieTest {

    Kelpie kelpie;

    @BeforeEach
    void setUp() {
        kelpie = new Kelpie("Kelpie", 50);
    }

    @Test
    void hasName() {
        assertEquals("Kelpie", kelpie.getName());
    }

    @Test
    void hasHp() {
        assertEquals(50, kelpie.getHp());
    }

    @Test
    void canTakeDamage() {
        kelpie.takeDamage(15);
        assertEquals(35, kelpie.getHp());
    }
}
