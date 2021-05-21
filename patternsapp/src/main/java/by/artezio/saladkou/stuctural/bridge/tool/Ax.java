package by.artezio.saladkou.stuctural.bridge.tool;

import by.artezio.saladkou.stuctural.bridge.material.Material;

public class Ax extends AbstractTool {

    public Ax(Material material) {
        super(material);
    }

    public void doStuff() {
        System.out.println("Ax made of " + material.getTitle() + " "
                + material.getQualityLevel().getTitle() + " cut trees down.");
    }
}
