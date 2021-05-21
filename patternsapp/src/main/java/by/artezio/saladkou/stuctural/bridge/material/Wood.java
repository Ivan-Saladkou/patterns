package by.artezio.saladkou.stuctural.bridge.material;

import by.artezio.saladkou.stuctural.bridge.QualityLevel;

public class Wood implements Material {

    public String getTitle() {
        return "wood";
    }

    public QualityLevel getQualityLevel() {
        return QualityLevel.HARDLY;
    }
}
