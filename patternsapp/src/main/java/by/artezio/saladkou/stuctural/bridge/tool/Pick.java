package by.artezio.saladkou.stuctural.bridge.tool;

import by.artezio.saladkou.stuctural.bridge.material.Material;

public class Pick extends AbstractTool {

    public Pick(Material material) {
        super(material);
    }

    public void doStuff() {
        System.out.println("Pick made of " + material.getTitle()
                + " suits for mining " + material.getQualityLevel().getTitle()+".");
    }
}
