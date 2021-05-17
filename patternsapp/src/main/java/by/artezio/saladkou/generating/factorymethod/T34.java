package by.artezio.saladkou.generating.factorymethod;

public class T34 implements Tank {

    private int x;
    private int y;

    public static final int DAMAGE = 100;

    public int shoot() {
        System.out.println("T34 is shooting...");
        return DAMAGE;
    }

    public void move(final int x, final int y) {
        System.out.println("T34 moving...");
        this.x += x;
        this.y += y;
    }
}
