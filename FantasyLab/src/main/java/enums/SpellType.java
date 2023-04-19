package enums;

public enum SpellType {
    CURSE(18),
    WRATH(12),
    FLARE(22);

    private final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
