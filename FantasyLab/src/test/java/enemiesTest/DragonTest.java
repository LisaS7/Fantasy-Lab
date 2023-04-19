package enemiesTest;

import enemies.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Smaug", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("Smaug",dragon.getName() );
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(100, dragon.getHp());
    }
}
