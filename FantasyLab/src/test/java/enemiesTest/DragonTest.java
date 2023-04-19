package enemiesTest;

import enemies.Dragon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DragonTest {

    Dragon dragon;

    @BeforeEach
    public void before() {
        dragon = new Dragon("Smaug", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Smaug",dragon.getName() );
    }

    @Test
    public void hasHp() {
        assertEquals(100, dragon.getHp());
    }

    @Test
    public void canTakeDamage() {
        dragon.takeDamage(100);
        assertEquals(0, dragon.getHp());
    }
}
