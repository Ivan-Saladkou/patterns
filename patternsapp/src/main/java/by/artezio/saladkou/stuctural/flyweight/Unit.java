package by.artezio.saladkou.stuctural.flyweight;

public class Unit {

    private UnitType type;
    private int x;
    private int y;
    private int health;
    private int armor;

    public Unit(UnitType type) {
        this.type = type;
        health = type.getHealthPoints();
        armor = type.getArmorPoints();
    }

    public UnitType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }
}
