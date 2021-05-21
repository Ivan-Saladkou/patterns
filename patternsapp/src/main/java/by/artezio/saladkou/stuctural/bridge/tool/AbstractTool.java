package by.artezio.saladkou.stuctural.bridge.tool;

import by.artezio.saladkou.stuctural.bridge.material.Material;

public abstract class AbstractTool {

    protected Material material;

    public AbstractTool(Material material) {
        this.material = material;
    }

    public abstract void doStuff();
}
