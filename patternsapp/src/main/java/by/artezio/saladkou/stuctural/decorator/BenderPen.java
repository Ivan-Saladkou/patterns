package by.artezio.saladkou.stuctural.decorator;

public class BenderPen extends PenDecorator {

    public BenderPen(Pen pen) {
        super(pen);
    }

    @Override
    protected void before(String message) {
        System.out.println("Bender: ");
    }
}
