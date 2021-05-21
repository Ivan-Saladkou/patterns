package by.artezio.saladkou.stuctural.decorator;

public abstract class PenDecorator implements Pen {

    private Pen pen;

    public PenDecorator(Pen pen) {
        this.pen = pen;
    }

    public final void write(String message) {
        before(message);
        pen.write(message);
        after(message);
    }

    protected void after(String message) {

    }

    protected void before(String message) {

    }
}
