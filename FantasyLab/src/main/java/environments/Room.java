package environments;

import enums.Exit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Room {
    private final ArrayList<Exit> exits = new ArrayList<>();

    public Room() {
        List<Exit> allExits = Arrays.asList(Exit.values());
        Collections.shuffle(allExits);
        int randomNumber = (int) (Math.random() * allExits.size());

        List<Exit> randomExits = allExits.subList(0, randomNumber);
        exits.addAll(randomExits);

    }

    public ArrayList<Exit> getExits() {
        return exits;
    }
}
