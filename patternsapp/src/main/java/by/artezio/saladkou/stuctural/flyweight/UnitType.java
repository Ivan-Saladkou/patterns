package by.artezio.saladkou.stuctural.flyweight;

public class UnitType {

    private String title;
    private int healthPoints;
    private int armorPoints;
    private int speed;
    //and many other fields that are the same for all of units

    public UnitType(String title, int healthPoints, int armorPoints, int speed) {
        this.title = title;
        this.healthPoints = healthPoints;
        this.armorPoints = armorPoints;
        this.speed = speed;
    }

    public String getTitle() {
        return title;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getArmorPoints() {
        return armorPoints;
    }
}
