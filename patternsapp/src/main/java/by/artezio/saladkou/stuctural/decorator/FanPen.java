package by.artezio.saladkou.stuctural.decorator;

public class FanPen extends PenDecorator {

    public FanPen(Pen pen) {
        super(pen);
    }

    public void before(String message) {
        System.out.println("Blowing off...");
    }
}
