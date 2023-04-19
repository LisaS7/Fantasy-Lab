package enums;

public enum Exit {
    NORTH("North"),
    EAST("East"),
    SOUTH("South"),
    WEST("West");

    private final String locations;

    Exit(String locations) {
        this.locations = locations;
    }

    public String getLocations() {return locations;}

}