package enemiesTest;

import enemies.Dragon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DragonTest {

    Dragon dragon;

    @BeforeEach
    void setUp() {
        dragon = new Dragon("Smaug", 100);
    }

    @Test
    void hasName() {
        assertEquals("Smaug",dragon.getName() );
    }

    @Test
    void hasHp() {
        assertEquals(100, dragon.getHp());
    }

    @Test
    void canTakeDamage() {
        dragon.takeDamage(100);
        assertEquals(0, dragon.getHp());
    }
}
