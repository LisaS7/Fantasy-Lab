package enemiesTest;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before() {
        troll = new Troll("Troll", 25);
    }

    @Test
    public void canGetName() {
        assertEquals("Troll", troll.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(25, troll.getHealthPoints());
    }
}
