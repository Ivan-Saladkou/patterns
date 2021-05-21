package by.artezio.saladkou.stuctural.decorator;

public class VkSendingPen extends PenDecorator {

    public VkSendingPen(Pen pen) {
        super(pen);
    }

    @Override
    protected void after(String message) {
        System.out.println("Sending \"" + message + "\" to all of your friends");
    }
}
