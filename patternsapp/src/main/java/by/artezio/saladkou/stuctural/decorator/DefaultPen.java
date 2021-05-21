package by.artezio.saladkou.stuctural.decorator;

public class DefaultPen implements Pen {

    public void write(String message) {
        System.out.println("Pen is writing \" " + message+"\"");
    }
}
