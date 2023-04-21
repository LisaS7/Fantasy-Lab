package enums;

public enum ItemType {
    DEATHCLAW_HIDE(100),
    DRAGON_SCALE(150),
    GOLD(50),
    SILVER(25),
    BOOK(10),
    CLOTH(5),
    OIL(18),
    RUM(15)
    ;

    private final int value;

    ItemType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
