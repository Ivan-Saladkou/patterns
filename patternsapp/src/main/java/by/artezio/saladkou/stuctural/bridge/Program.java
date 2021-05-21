package by.artezio.saladkou.stuctural.bridge;

import by.artezio.saladkou.stuctural.bridge.material.Diamond;
import by.artezio.saladkou.stuctural.bridge.material.Gold;
import by.artezio.saladkou.stuctural.bridge.material.Wood;
import by.artezio.saladkou.stuctural.bridge.tool.AbstractTool;
import by.artezio.saladkou.stuctural.bridge.tool.Ax;
import by.artezio.saladkou.stuctural.bridge.tool.Pick;
import by.artezio.saladkou.stuctural.bridge.tool.Sword;

public class Program {

    public static void main(String[] args) {
        AbstractTool sword = new Sword(new Diamond());
        AbstractTool pick = new Pick(new Gold());
        AbstractTool ax = new Ax(new Wood());

        sword.doStuff();
        pick.doStuff();
        ax.doStuff();
    }
}
