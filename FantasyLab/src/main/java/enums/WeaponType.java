package enums;

public enum WeaponType {
    SWORD(15),
    CLUB(10),
    AXE(12);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
