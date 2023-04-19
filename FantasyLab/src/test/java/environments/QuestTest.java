package environments;

import enemies.Orc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestTest {
    Quest quest;

    @BeforeEach
    void setUp() {
        quest = new Quest();
    }

    @Test
    void hasRooms() {
        assertEquals(10, quest.numberOfRooms());
    }

}
