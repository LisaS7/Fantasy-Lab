package enemiesTest;

import enemies.Ghoul;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GhoulTest {
    Ghoul ghoul;

    @BeforeEach
    public void before() {
        ghoul = new Ghoul("Domhnall Dubh", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Domhnall Dubh", ghoul.getName() );
    }

    @Test
    public void hasHp() {
        assertEquals(100, ghoul.getHp());
    }

    @Test
    public void canTakeDamage() {
        ghoul.takeDamage(100);
        assertEquals(0, ghoul.getHp());
    }
}
