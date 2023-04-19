package enemiesTest;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before() {
        orc = new Orc("Orc", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Orc", orc.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(10, orc.getHp());
    }
}
