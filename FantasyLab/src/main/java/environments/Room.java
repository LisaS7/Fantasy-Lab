package environments;

import enums.Exit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Room {
    private ArrayList<Exit> exits = new ArrayList<>();

    public Room() {
        List<Exit> allExits = Arrays.asList(Exit.values());
        Collections.shuffle(allExits);
        int randomNumber = (int) (Math.random() * allExits.size());

        for (int i = 0; i < randomNumber; i++) {
            exits.add(allExits.get(i));
        }
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }
}
