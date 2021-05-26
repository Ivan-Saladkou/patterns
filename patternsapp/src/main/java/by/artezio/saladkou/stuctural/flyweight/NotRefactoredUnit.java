package by.artezio.saladkou.stuctural.flyweight;

public class NotRefactoredUnit {

    private String title;
    private int healthPoints;
    private int armorPoints;
    private int speed;
    private int x;
    private int y;
    private int health;
    private int armor;

    public NotRefactoredUnit() {
        this.title = "Default unit";
        this.healthPoints = 100;
        this.armorPoints = 100;
        this.speed = 100;
        this.health = 100;
        this.armor = 100;
    }
}
