package by.artezio.saladkou.stuctural.bridge.tool;

import by.artezio.saladkou.stuctural.bridge.material.Material;

public class Sword extends AbstractTool {

    public Sword(Material material) {
        super(material);
    }

    public void doStuff() {
        System.out.println("Sword made of " + material.getTitle()
                + " suits for fighting with enemies " + material.getQualityLevel().getTitle() +".");
    }
}
