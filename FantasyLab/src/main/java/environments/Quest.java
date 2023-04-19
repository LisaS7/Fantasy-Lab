package environments;

import java.util.ArrayList;

public class Quest {

    ArrayList<Room> rooms = new ArrayList<>();

    public Quest() {
        for (int i = 0 ; i < 10 ; i++) {
            rooms.add(new Room());
        }
    }

    public int numberOfRooms() {
        return rooms.size();
    }
}
