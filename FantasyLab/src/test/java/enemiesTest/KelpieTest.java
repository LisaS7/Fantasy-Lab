package enemiesTest;

import enemies.Kelpie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KelpieTest {

    Kelpie kelpie;

    @Before
    public void before() {
        kelpie = new Kelpie("Kelpie", 50);
    }

    @Test
    public void canGetName() {
        assertEquals("Kelpie", kelpie.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(50, kelpie.getHp());
    }
}
