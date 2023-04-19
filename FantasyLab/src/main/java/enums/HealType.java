package enums;

public enum HealType {
    POTION(18),
    ELIXIR(25),
    HERBS(5);


    private final int healPoints;

    HealType(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {return healPoints;}
}
