package by.artezio.saladkou.stuctural.decorator;

public class Program {

    public static void main(String[] args) {

        String message = "I'm learning the decorator pattern";

        Pen pen = new DefaultPen();
        Pen vkPen = new VkSendingPen(pen);
        Pen fanPen = new FanPen(pen);
        Pen benderPen = new BenderPen(pen);

        Pen superPan = new VkSendingPen(new FanPen(new BenderPen(pen)));

        printPenTest(pen, message, "Default");
        printPenTest(vkPen, message, "Vk");
        printPenTest(fanPen, message, "Fan");
        printPenTest(benderPen, message, "Bender");
        printPenTest(superPan, message, "Super");
    }

    private static void printPenTest(Pen pen, String message, String penTitle) {
        System.out.println(penTitle + " pen:");
        pen.write(message);
        System.out.println("------------------\n");
    }
}
